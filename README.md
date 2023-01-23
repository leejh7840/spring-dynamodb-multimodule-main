AWS DynamoDB Multimodule Project 

This is a model project with sample implementation of RESTApis with AWS DynamoDB and dockerized application.

Requirements
For building and running the application you need:

JDK 17<br />
Gradle 7.3.2<br />
Docker (Only needed if you want to run it on docker)<br />
AWS accesskey<br />
AWS secretkey<br />


Building
Gradle is the main tool for build & dependency management.<br />
You will be able to run gradle commands via the gradle wrapper in the root of this project, e.g. ./gradlew tasks

Enter your AWS region, accesskey and secretkey in aws-dynamodb-multimodule-api-web\src\main\resources\aws-credentials.properties.

./gradlew clean - Deletes the build directory.<br />
./gradlew build - Assembles and tests this project.<br />

Start application

./gradlew bootRun --> Starts the application on your local environment as a normal SpringBoot app.

docker-compose up --build -d --> Starts SpringBoot app on docker container.<br />
docker-compose down --volumes --rmi all --> Stops SpringBoot app and removes all images and volumes related to the SpringBoot app.

-----
Dynamo DB table insert and item insert ReadMe Instructions:

Step 1: AWS CLI installation and Pre-requiste:
	1. Instal Amazon CLI for windows[ Refer https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html]
	2. Configuring Access Key and Security key and the profile setup [ Refer https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-quickstart.html#cli-configure-quickstart-config]
		Sample:
	 		$ aws configure
			AWS Access Key ID [None]: AKIAIOSFODNN7EXAMPLE
			AWS Secret Access Key [None]: wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY
			Default region name [None]: us-west-2
			Default output format [None]: json

	3.Enviornment variable setup [ Refer: https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-envvars.html]
	4.Enables the auto-prompt for the AWS CLI version. aws_cli_auto_prompt=on

Step 2  JSON File Creation for New Table Creation:
	Sample file -Uploaded in the current repositery spring-dynamodb-multimodule\aws-Dynamodb-Table Script\1.Order_Table_Creation_JSON_Script
Step 3: Run the AWS table script command [Sample file  - spring-dynamodb-multimodule\aws-Dynamodb-Table Script\2. dynamodb-table-ddl-script-insert] - JSON format
Step 4: Run the AWS table item insert [ Sample file 3. spring-dynamodb-multimodule\aws-Dynamodb-Table Script\dynamodb_table_value_insert_dml_script] -JSON format
Step 5: Verify the dynamodb table values using AWS console -Goto Dynamo DB Service->Table->Explore table Items.
	Verify the dynamodb table values using AWS Cli - [Sample file 4.spring-dynamodb-multimodule\aws-Dynamodb-Table Script\4.dynamodb-table-fetch-script]
	