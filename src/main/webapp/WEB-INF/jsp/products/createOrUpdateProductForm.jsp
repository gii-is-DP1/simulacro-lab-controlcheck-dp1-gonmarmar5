<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="home">
    <h2><fmt:message key="welcome"/></h2>
    <div class="row">
        <div class="col-md-12">
            <spring:url value="/resources/images/pets.png" htmlEscape="true" var="petsImage"/>
            <img class="img-responsive" src="${petsImage}"/>
        </div>
    </div>
    <div>
     
        <form:form modelAttribute="product" action="/product/created" method="POST" >
            <input type="text" name="name" placeholder="name"/> <br> <br>
            <input type="number" name="price" placeholder="price"/> <br> <br>
            
            <petclinic:selectField name="productType" label= "productType" names="${productType}" size="3"/> 
            
            <input type="submit" value="Crear"/>
        </form:form>     
    </div>

    
</petclinic:layout>
