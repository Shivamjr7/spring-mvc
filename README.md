# spring-mvc : web part of Spring 


## Basics
* Framework for building web applications in java
* Based on MVC pattern  (Model , view and controller )
* Built on top of servlet api
* Model is data , View : presentation logic , controller : routing logic
* Separates roles of model , view and controller
* Request comes to Front controller (Dispatcher servlet ) ->goes to handler mapping to find controller -> transfers to @Contoller -> populates model and returns view name along with model data to front controller -> Front controller gives it to View Resolver to resolve the view name
* Handler mapping , view resolver and controller are part of WebApplicationContext
* To enable mvc support through java config , add @EnableWebMvc in the @Configuartion class  : this will register controllers and other mappings
* For custom config  we have to implement WebMvcConfigurer  and  add config like view resolvers …
* **ViewResolver**:
    * By default spring boot provides a InternalResourceViewResolver  and BeannameResolver to resolve views
    * We can also add different view resolver for ex : thymleaf resolves views from classpath:/templates/
    * In case of multiple view resolvers always add the order
      ￼

** **

### Form :

* can use form tag to add a form
* when using GET we can access the param in jsp using ${param.name} field
* In Controller code we can use HttpServletRequest.getParam as well to get the field
* To access a data from model in jsp use ${modelName}
* context path is root path of the application , by default it is "" , so localhost:8080/
* It can be configured with server.servlet.context-path=${path} , localhost:8080/path
* We can also add servlet path after this using spring.mvc.servlet.path


#### @RequestParam
* @RequestParam to extract query parameters, form parameters, and even files from the request.
* If we want variable name and param name to be different we can map using name : @RequestParam(name="param")
* By default param are required , we can set required = false and also give a default value

#### @PathVariable
* @PathVariable annotation can be used to handle template variables in the request URI mapping
* localhost:8080/spring/{id} : id here is a path variable
* if var name and path var name not same , we can use @PathVariable("id") or @PathVariable(value="id")
* By default required , can be set to false @PathVariable(required = false)


#### Difference in @RequestParam and @PathVariable

* @RequestParam extract values from query string while @PathVariable extracts value from the path
* Values extracted by @PathVariable is not encoded while values extracted by @RequestParam are encoded

##### Spring Form and tags :

* Spring has custom form tags which helps in binding data and view of Form
* To use spring form tags , insert <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
* path in form input invokes getter on the pojo class
* @ModelAttribute is an annotation that binds a method parameter or method return value to a named model attribute, and then exposes it to a web view.

** ** 

### Sending data from controller to view

**Using Model**
* We can add attribute to model in java class and display in view page with **${modelName}**

Using ModelandView
* ModelandView.addObject("object",object)


** ** 

#### redirect views in spring mvc 

* using redirect : "redirect:/path"
* using RedirectView.seturl
* using HttpServletResponse.sendredirect

** ** 
#### ControllerAdvice : this tells Spring to handle exceptions 




