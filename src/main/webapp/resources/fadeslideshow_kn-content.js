var mygallery=new fadeSlideShow({
	wrapperid: "fadeshow", //ID of blank DIV on page to house Slideshow
	dimensions: [968, 369], //width/height of gallery in pixels. Should reflect dimensions of largest image
	imagearray: [
		["resources/header_image13.jpg", "", "", "ಹಳ್ಳಿಕಾರ್<br /><span>ರಾಜ್ಯ ವೀರ್ಯ ಸಂಕಲನಾ ಕೇಂದ್ರ, ಹೆಸರಘಟ್ಟ</span>"], //["url to image", "http link", "target", "desctiption to show"]
		["resources/header_image9.jpg", "", "", "ಹೋಲ್-ಸ್ಟೀನ್ ಫ್ರೀಸಿಯನ್<br /><span>ರಾಜ್ಯ ಜಾನುವಾರು ಸಂವರ್ಧನಾ ಮತ್ತು ತರಬೇತಿ ಕೇಂದ್ರ, ಹೆಸರಘಟ್ಟ</span>"],		
		["resources/header_image11.jpg", "", "", "ಸೋವಿಯತ್ ಚಿಂಚಿಲಾ<br /><span>ಜಾನುವಾರು ಸಂವರ್ಧನಾ ಕ್ಷೇತ್ರ, ಹೆಸರಘಟ್ಟ</span>"],
		["resources/header_image1.jpg", "", "", "ಜರ್ಸಿ<br /><span>ರಾಜ್ಯ ಜಾನುವಾರು ಸಂವರ್ಧನಾ ಮತ್ತು ತರಬೇತಿ ಕೇಂದ್ರ, ಹೆಸರಘಟ್ಟ</span>"]
	],
	displaymode: {type:'auto', pause:5000, cycles:0, wraparound:false},
	persist: false, //remember last viewed slide and recall within same session?
	fadeduration: 900, //transition duration (milliseconds)
	descreveal: "peekaboo",
	togglerid: ""
})