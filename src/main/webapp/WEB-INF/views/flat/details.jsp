<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--&lt;%&ndash;<form:form method="post" modelAttribute="details">&ndash;%&gt;--%>
<%--&lt;%&ndash;<form:hidden path="id"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;<form:input path="prize"/> Kwota najmu<br/>&ndash;%&gt;--%>
<%--&lt;%&ndash;<form:input path="rentalPeriod"/> Okres najmu<br/>&ndash;%&gt;--%>



<form:form method="post" modelAttribute="details">
    ${details.prize}<br>
    ${details.rentalPeriod}
</form:form>

