<%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Krazo Hello</title>
        </head>

        <body>
            <h1>Hello,
                <c:out value="${name}" />!
            </h1>
            <form action="${pageContext.request.contextPath}/mvc/hello" method="get">
                <label for="name">Name</label>
                <input id="name" name="name" type="text" required>
                <button type="submit">Say hello</button>
            </form>
        </body>

        </html>