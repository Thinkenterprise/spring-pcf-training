# Importing a CSV file into MySQL database

This example illustrates how to use the database connector to import data in a CSV format from a local directory into mysql DB.

###Example Use Case
In this example we transform a sample CSV file containing flight route data into a Map with a key value pair. We use the DataWeave transformer to do so. This Map is basically a collection called route. With the collectiopn splitter with seperate the data stream in single records, which are written to the database with the database connector record by record.

###Set Up and Run the Example


1 Import the Example project in Anypoint Studio with File/Import, choose Anypoint Studio/Anypoint Studio Project from External Location and select the spring-pcf-enterprise-start directory

2 Configure the MySQL database connection by opening the flow file csv-to-db.xml and selecting the tab 'Global Elements' 

3 **Create a folder** called *input* under src/main/resources and copy the input.csv file into the input folder

4 **Run** the example project as a mule application

### Go Further
* Read more about the database connector [here](https://docs.mulesoft.com/mule-user-guide/v/3.7/database-connector)
* Read more about the collection splitter [here](https://docs.mulesoft.com/mule-user-guide/v/3.7/splitter-flow-control-reference)
* Learn more about Anypoint DataWeave [here](https://developer.mulesoft.com/docs/display/current/DataWeave+Reference+Documentation)