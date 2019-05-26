$(document).on("click", "#btnLogin", function(){
	var result = isValidFormLogin();
	if(result=="true")
	{	$("#formLogin").submit();	}
	else
	{	$("#divStsMsgLogin").html(result)	}
});

function isValidFormLogin(){
	
	if($('#txtUserName').val() == null)
		return "Enter UserName";
	
	if($('#txtPassword').val() == null)
		return "Enter Password"
		
//	if($.trim($("#txtUserName").val()==null))
//	{	return "Enter UserName";	}
//	if($.trim($("#txtPassword").val()==null))
//	{	return "Enter Password";	}
	return "true";
}

$(document).on("click", "#btnSave", function(){
	var result = isValidFormItem();
	if(result=="true")
	{	$("#formItems").submit();	}
	else
	{	$("#divStsMsgItem").html(result)	}
});

function isValidFormItem(){
//	if($.trim($("#txtItemName").val==""))
//	{	return "Enter Item Name";	}
//	if($.trim($("#txtItemDesc").val==""))
//	{	return "Enter Item Description";	}
	return "true";
}

$(document).on("click", "#btnEdit", function(){
	$("#hidMode"),val("update")
	$("#hidID").val($(this).attr("param"));
	$("#txtItemName").val($(this).clonest("tr").find('td:eq(1)').text());
	$("#txtItemDesc").val($(this).clonest("tr").find('td:eq(2)').text());
});

$(document).on("click", "#btnRemove", function(){
	$("#hidMode"),val("remove")
	$("#hidID").val($(this).attr("param"));
	var res = confirm("Are you sure?");
	if(res == true){
		$("#formItems").submit();
	}
});