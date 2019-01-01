## Install Maven
You must install Maven first

[Click here to download Maven](https://maven.apache.org/download.cgi)

[Click here to install Maven](https://maven.apache.org/install.html)

## MySQL
This project using MySQL. Make sure you have installed MySQL in your system.
Create a database first, then configure setting based on your database. 

Open /src/main/resources/application.properties

Then, set the parameter based on your database : 

```properties
spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/<Your_Database>
spring.datasource.username=<Your Username>
spring.datasource.password=<Your Password>
```

## Usage
Open the project's directory. Then run this command : 

```cmd
mvn clean install
java -jar target\test-0.2.0.jar
```

## Contributing
Pull requests are welcome. For major changes and/or sugesstions, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
