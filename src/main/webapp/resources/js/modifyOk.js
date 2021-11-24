/**
 * 
 */
 
function updateInfoConfirm() {
	
	if(document.modify_form.name.value.length == 0) {
		alert("이름은 필수 사항입니다.");
		modify_form.name.focus();
		return;
	}	

	if(document.modify_form.pw.value == "") {
		alert("패스워드를 입력하세요.");
		document.modify_form.pw.focus();
		return;
	}
	
	if(document.modify_form.pw.value != document.modify_form.pw_check.value) {
		alert("패스워드가 일치하지 않습니다.");
		modify_form.pw.focus();
		return;
	}
	
	if(document.modify_form.email.value.length == 0) {
		alert("이메일은 필수 사항입니다.");
		modify_form.email.focus();
		return;
	}
	
	document.modify_form.submit();
	
}