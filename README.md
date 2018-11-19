# RetrofitDemo
This project contains the sample code and library to get the details of stock which includes company information, stock price.

# Get Started
Add folowing code to root level build.gradle file:-

	allprojects {
    	repositories {
       		...
        		maven { url 'https://jitpack.io' }
    	}
	}

Add following dependency to project level build.gradle file:-

	implementation 'com.github.nikhiljadhav159:RetrofitDemo:1.0'

Then use GetStockDetails object to get reponse:-

	GetStockDetails getStockDetails = new GetStockDetails(new ResponseCallBack() {
            @Override
            public void onSuccess(ExpectedResponse response) {
               //TO DO handle the response object
		//This Expected Response object contains all information about company and stock price and error response.
							 
		//To get company information
		response.getCompany().getCompanyName();
								
		//To get stock price
		response.getPrice();
								
		//To get an Exception message
		response.getException();
            }
        });
        //get Response for Stock Symbol e.g "AAPL"
        getStockDetails.callForData("AAPL");
				
# Note:-
	1. This libarry includes dependecy on Retrofit and GSON Parser.
	2. No need to add Internet permission or Internet connection check handling.
	3. In above sample project Data Binding is used to show the results of Stock Symbol.
