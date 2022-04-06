$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Featurefiles/facebookpage.feature");
formatter.feature({
  "name": "FaceBook Page Login Fnction",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@FBUI"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "To validate FB pae login function with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@FBUI"
    },
    {
      "name": "@Login"
    },
    {
      "name": "@TC01"
    },
    {
      "name": "@FBLogin"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "facebookpagesteps.user_Launch_the_browser()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Failed to instantiate class com.stepdef.facebookpagesteps\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:47)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:49)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:41)\r\n\t... 33 more\r\nCaused by: java.lang.Error: Unresolved compilation problem: \n\tSyntax error on token \"String\", strictfp expected\n\r\n\tat com.stepdef.facebookpagesteps.\u003cinit\u003e(facebookpagesteps.java:17)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters the Url",
  "keyword": "And "
});
formatter.match({
  "location": "facebookpagesteps.user_enters_the_Url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters the username and password",
  "rows": [
    {
      "cells": [
        "hello",
        "12345"
      ]
    },
    {
      "cells": [
        "gaya",
        "liya"
      ]
    },
    {
      "cells": [
        "prabha",
        "liya"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "facebookpagesteps.user_enters_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters the login button",
  "keyword": "And "
});
formatter.match({
  "location": "facebookpagesteps.user_enters_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User navigate to login failure page",
  "keyword": "Then "
});
formatter.match({
  "location": "facebookpagesteps.user_navigate_to_login_failure_page()"
});
formatter.result({
  "status": "skipped"
});
});