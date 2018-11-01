fetch(`/api/states/${window.location.pathname.split('/')[2]}`)
	.then(res => res.json())
	.then(data => {
		console.log(data)
		const body = document.body
		const pageTitle = `<h1>${data.stateName}</h1>`
		
		body.innerHTML= pageTitle + body.innerHTML
	})