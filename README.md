# mad-goat-log4shell

MAD Goat spring boot application explaning what a goat shell is. :goat:

> **Warning**
> This application may contain the log4shell vulnerability depending on the version of the log4j library used.
> On the branch safe you can find a version of the application that does not contain the vulnerability.
> On the branch unsafe you can find a version of the application that contains the vulnerability.

## Pre-requisites

- Java 17
- Maven

## Run the application

1. Open a terminal
2. Clone the repository
3. Go to the root of the project
4. Run the following command

```bash
mvn spring-boot:run
```

## Vulnerability

On December 9th, the most critical zero-day exploit in recent years was discovered affecting most of the biggest enterprise companies. This critical 0-day exploit was discovered in the extremely popular Java logging library which allows RCE (Remote code execution) by logging a certain payload.

![Log4j Vulnerability](/assets/log4shell.jpg)

This vulnerability is also known as CVE-2021-44228 which has a CVSS (Common Vulnerability Scoring System) score of 10, which is the highest risk possible and was published by GitHub advisory with a critical severity level. [Checkmarx](https://checkmarx.com/blog/apache-log4j-remote-code-execution-cve-2021-44228/)

## Explore the vulnerability

1. Find the base URL of the goat4shell service.
2. Make a GET request to the following endpoint: /goatShell
3. You should see the following response:

```bash
{
    "name": "Goat Shell",
    "description": "Meet the extraordinary goat with a shell on its back, a truly unique creature that challenges our understanding of the natural world. This remarkable animal defies convention with its unusual adaptation, offering a level of protection that its unshelled counterparts lack. Join us as we explore this fascinating species and uncover the secrets of its remarkable shell."
}
```

4. Make the same GET request but add the optional header "X-API-Version" with the value "${jndi:ldap://127.0.0.1:10250/asdsds}" to the request.

5. If you are debugging the application or running it on a acceessable container, you can see the following log:

```bash
2023-08-15 15:12:46,787 http-nio-8080-exec-8 WARN Error looking up JNDI resource [ldap://127.0.0.1:10250/asdsds]. javax.naming.CommunicationException: 127.0.0.1:10250 [Root exception is java.net.ConnectException: Connection refused]
```

6. This means that the application is vulnerable to the log4shell vulnerability.
