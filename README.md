# Demo Spring Selenium Automation Project

## Table of Contents

- [Authors](#authors)
- [Pre-requisites](#pre-requisites)
- [Libraries](#libraries)

## Authors

* [Debapriyo Haldar](https://github.com/zephyr359)	
* [Soraia Reis](https://github.com/soraiareis)


## Pre-requisites

You should download and install these properly on your system. Visit the websites (linked) to find instructions on how to set them up.

* [Java](https://www.java.com/en/download/)
* [Gradle](https://gradle.org/)
* Chrome
* Idea / Eclipse IDE


## Libraries

* [Cucumber](https://cucumber.io/) - library used to support Behavior-Driven Development (BDD).
* [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/) - drives a browser natively, as a real user would, either locally or on remote machines.
* [Hamcrest](http://hamcrest.org/JavaHamcrest/tutorial) - a framework for writing matcher objects allowing ‘match’ rules to be defined declaratively.
* [Lombok](https://projectlombok.org/) -Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java
* [Spring Boot]


* Spring Profile: We can run either default or test. Nothing to be done when you want to execute the default profile, but for the test profile the environment variable SPRING_PROFILES_ACTIVE should be set as "test".
* Context: We can either run local (local Firefox) or remote (in Docker containers). The default value is "remote", but for "local" the context property should be set as "local". In the command line, we pass the following argument: -Dcontext=local.
* Browser: If we run remotely we have the option of running in a Firefox or Chrome browser. The default value is "firefox", but for "chrome" the browser property should be set as "chrome". In the command line, we pass the following argument: -Dbrowser=chrome.
* Parallel: It is configured to run in parallel by default. The default threads count for parallel executions is 10. We can either change the thread count to 1 and execute them sequentially or even increase the default number if necessary. In the command line, we pass the following argument with the thread count: -Ddataproviderthreadcount="1".
* Tags: All the scenarios are executed unless we specify the tag group that we want to execute. In the command line, we pass the following argument along with the tag(s): -Dcucumber.filter.tags="@smoke"