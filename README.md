# Raml Generator
Test Raml Generator to Spring MVC

Testing and example of Spring MVC-RAML Synchronizer Plugin (https://github.com/phoenixnap/springmvc-raml-plugin/tree/master/springmvc-raml-plugin#usage-3---generating-springmvc-server-endpoints-from-a-raml-file)

--
Generate interface :

	* Indicate the path of the raml
	* Indicate the package
	* Add spring-webmvc to the pom
	* Add jackson (core/annotations) to the pom
	* Add commons-lang to the pom

	mvn clean compile
	
    * Review the source code and resolve the mistakes

    --
 	+ Add in the clean -> Delete the generated code
 	+ Improvement : Add a source code formatter
 	+ Improvement : Move the model in a different project 
 	+ Check : Validations
 	+ Check : Lombock
 	
 Generar code :

 	* Create the implementations 

 	--
 	+ Improvement : Generate the source code of the compoment automatically
 	+ Add Test
 	
