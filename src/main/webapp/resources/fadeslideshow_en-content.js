var mygallery=new fadeSlideShow({
	wrapperid: "fadeshow", //ID of blank DIV on page to house Slideshow
	dimensions: [968, 369], //width/height of gallery in pixels. Should reflect dimensions of largest image
	imagearray: [
		["resources/header_image13.jpg", "", "", "Hallikar<br />"], //["url to image", "http link", "target", "desctiption to show"]
		["resources/header_image9.jpg", "", "", "Holstein Friesian<br />"],		
		["resources/header_image11.jpg", "", "", "Soviet Chinchilla<br />"],
		["resources/header_image1.jpg", "", "", "Jersey<br />"]
	],
	displaymode: {type:'auto', pause:5000, cycles:0, wraparound:false},
	persist: false, //remember last viewed slide and recall within same session?
	fadeduration: 900, //transition duration (milliseconds)
	descreveal: "peekaboo",
	togglerid: ""
})