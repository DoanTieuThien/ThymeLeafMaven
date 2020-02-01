var rootAddress = 'http://localhost:8282';
var defaultTimeout = 60 * 1000;

function configAjax() {
	$.ajaxPrefilter(function(options, original_Options, jqXHR) {
		options.async = true;
	});
}

function blockUI() {
	$
			.blockUI({
				baseZ : 3000,
				blockMsgClass : 'blockMsgNew',
				message : '<img src="img/loading.gif" width = 50 height = 50/>&nbsp;&nbsp;&nbsp;&nbsp;<h4 style ="animation: blink 1s infinite;color: #fff">Loading...</h4>'
			});
}

function unblockUI() {
	$.unblockUI();
}

function invokeJsonFunction(url, datainput, method, timeout, functionName,
		errorHandle, isSendData) {
	blockUI();
	configAjax();

	if (isSendData) {
		$.ajax({
			url : url,
			crossDomain : true,
			cache : false,
			dataType : 'json',
			type : method,
			data : JSON.stringify(datainput),
			contentType : 'application/json',
			timeout : timeout,
			async : true,
			processData : false,
			success : function(data, textStatus, jQxhr) {
				functionName(data, datainput);
				unblockUI();
			},
			error : function(jqXhr, textStatus, errorThrown) {
				errorHandle(textStatus);
				unblockUI();
			}
		});
	} else {
		$.ajax({
			url : url,
			crossDomain : true,
			cache : false,
			dataType : 'json',
			type : method,
			contentType : 'application/json',
			timeout : timeout,
			async : true,
			processData : false,
			success : function(data, textStatus, jQxhr) {
				functionName(data, datainput);
				unblockUI();
			},
			error : function(jqXhr, textStatus, errorThrown) {
				errorHandle(textStatus);
				unblockUI();
			}
		});
	}
}