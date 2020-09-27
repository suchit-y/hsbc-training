function validate() {

	if (document.myForm.name.value == "") {
		alert("Please provide your name!");
		document.myForm.name.focus();
		return false;
	}
	if (document.myForm.email.value == "") {
		alert("Please provide your Email!");
		document.myForm.email.focus();
		return false;
	}
	if (document.myForm.pwd.value == "" || document.myForm.pwd.value.length < 8) {

		alert("Please choose correct password!");
		document.myForm.pwd.focus();
		return false;
	}
	return (true);
}

function toJSON() {
	if (validate())
		alert("JSON file: {name: " + document.myForm.name.value + " ,"
				+ "password: " + document.myForm.pwd.value + " ," + "email: "
				+ document.myForm.email.value + " ," + "gender: "
				+ document.getElementById("gender").value + " ," + "country: "
				+ document.myForm.country.value + " }")
	return (true);
}