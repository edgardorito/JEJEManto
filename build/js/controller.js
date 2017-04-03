$( document ).ready(function(){
	 $('.button-collapse').sideNav({
	      
	      closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
	     
	    }
  	);

	$('.datepicker').pickadate({
    	selectMonths: true, // Creates a dropdown to control month
    	selectYears: 20 // Creates a dropdown of 15 years to control year
 	 });
})

