# Design Patterns / Creational: Factory Method

<p>The Factory Method suggests that you replace direct object construction calls (using the new operator) with calls to your Factory Method. Objects returned by a Factory Method are often referred to as "products".

At first glance, this change might seem pointless: we just moved the constructor call from one part of the program to another. However, consider this: you can now override the Factory Method in a subclass and change the class of products being created by the method.

However, there is a small limitation: subclasses can return different types of products only if those products have a common base class or interface. Also, the Factory Method in the base class must have its return type declared as this interface.<p>

<hr>

<p><b>Scenario:</b> You are an uber software engineer. The entire application was designed around cars, but now, there is a demand from the business area to create the Uber Eats service. This means that now we will also have Bikes. Solve this problem implementing the Factory Method Pattern.</p>

<hr>

### How to run this app?

<p>Obs: You must have JAVA installed on your computer</p>

<ol>
    <li>Download the 'factory_method.jar' file inside de 'out' folder</li>
    <li>Open your terminal</li>
    <li>Go to your Download folder</li>
    <li>Type: java -jar factory_method.jar</li>
</ol>
