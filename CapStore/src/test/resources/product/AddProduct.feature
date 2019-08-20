Feature: Inventory Control


Scenario: Enter Product Name
Given User is on 'Add Product' page
When User does not fill the Product Name
Then displays 'Please fill the Product Name'

Scenario: Enter Merchant Id
Given User is on 'Add Product' page
When User does not fill the Correct Merchant Id
Then displays 'Please fill the Merchant Id'



Scenario: Enter Product Company
Given User is on 'Add Product' page
When User does not fill the Product Company
Then displays 'Please fill the Product Company'


Scenario: Enter Product Photo
Given User is on 'Add Product' page
When User does not upload the Product Photo
Then displays 'Please upload the Photo'


Scenario: Enter Product Description
Given User is on 'Add Product' page
When User does not fill the Product Description
Then displays 'Please fill the Product Description'


Scenario: Enter Product Quantity
Given User is on 'Add Product' page
When User does not fill the Product Quantity
Then displays 'Please fill the Product Quantity'


Scenario: Enter Product Category
Given User is on 'Add Product' page
When User does not fill the Product Category
Then displays 'Please fill the Product Category'


Scenario: Enter Product Sub-Category
Given User is on 'Add Product' page
When User does not fill the Product Sub-Category
Then displays 'Please fill the Product Sub-Category'



Scenario: Enter Product Tag
Given User is on 'Add Product' page
When User does not fill the Product Tag
Then displays 'Please fill the Product Tag'


Scenario: Enter Sold Quantities
Given User is on 'Add Product' page
When User does not fill the Sold Quantities
Then displays 'Please fill the Sold Quantities'

Scenario: Enter Price
Given User is on 'Add Product' page
When User does not fill the Price
Then displays 'Please fill the Price'


Scenario: Enter Product Release Date
Given User is on 'Add Product' page
When User should fill the date
Then displays 'Please fill the Release Date'


Scenario: Vaild Products Details
	Given user is on 'Add Product' page
	When user enters vaild product details and clicks on 'Submit' button
	Then display 'Product Added successfully !!!'
	
	
	Scenario: When user clicks on Reset Button
	Given user is on 'Add Product' page
	Then  User can again fill the details
	
	
	Scenario: When user clicks on 'Show Product' button
	Given user is on 'Show Product' page
	Then display all the products in the list!!.
	