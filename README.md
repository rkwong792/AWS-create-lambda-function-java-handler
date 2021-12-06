<h2> Creating a Lambda Function with Java - AWS Java SDK</h2>

https://www.sentinelone.com/blog/aws-lambda-java-simple-introduction-examples/

<h4>
Creates a handler function with Java. The Lambda function handler is the method in your function code that processes events. When you function is invoked, Lambda runs the handler method.

After the handler is uploaded to a new Lambda Function, we can create an S3 trigger. Click "Add trigger" in our lambda function and attach an S3 bucket to it as trigger. Now, whenever any object is uploaded
to the S3 bucket, this will be an event that will trigger our lambda function.

Use CloudWatch logs to debug any S3Events that come in.
</h4>

Get your AWS Java SDK for Amazon S3 from the link below:
* The AWS Java SDK for Amazon S3 module holds the client classes that are used for communicating with Amazon Lambda.
* https://mvnrepository.com/

Add the dependencies to your pom.xml.

After adding the dependencies, click the 'Refresh' or 'Reload All Maven Projects' button. There should now be a new
'Dependencies' sub-section under the Maven window on the right-hand side.

Set up credentials to make calls to AWS through the AWS SDK using Java. On Windows 10, the credentials
are stored under /user/.aws.

1) Download AWS CLI
2) Type 'aws configure'
3) Put in your access key ID
4) Put in your secret access key ID
5) Put region as Us-east-2
6) (default output format[None] - Leave Blank)
   ** Refer to Notes on Google Drive for SAA Certification

