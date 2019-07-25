$(function(){
	//solving the active menu problem
	switch(menu){
	case 'Home':
		$('#home').addClass('menu_active');
		break;
	case 'Our Aircraft':
		$('#ourAircraft').addClass('menu_active');
		break;
	case 'Safety':
		$('#safety').addClass('menu_active');
		break;
	case 'Charters':
		$('#charters').addClass('menu_active');
		break;
	case 'Contact':
		$('#contacts').addClass('menu_active');
		break;
	default:
		$('#home').addClass('menu_active');
		break;
	}
});