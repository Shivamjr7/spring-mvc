<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>

    <html lang="en">

    <head>
        <title>Games Arcade</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>

    <body>

        <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
            <a class="navbar-brand" href="">Games Arcade</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01"
                aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01"></div>
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="">contact</a>
                </li>
                <li class="navbar-item">
                    <a class="nav-link" href="">login</a>
                </li>
                <li class="navbar-item">
                    <a class="nav-link" href="">sign up</a>
                </li>
            </ul>
            </div>
        </nav>


        <div class="jumbotron text-center">
            <h1>Games Arcade</h1>
            <p>Resize this responsive page to see the effect!</p>
        </div>




        <div class="container">
            <div class="row">
                <h1 style="text-align: center;">List Games</h1>
                <a style="margin-left: 100px;" class="btn btn-primary" href="/springbootmvc/welcome" role="button">Add
                    game</a>
            </div>



            <table class="table table-striped table-bordered">
                <thead class="table-dark">
                    <tr>
                        <th> Game </th>
                        <th> Price</th>
                        <th> Description </th>
                        <th> Actions </th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <c:forEach var="game" items="${games}">
                            <td> ${game.name}</td>
                            <td> ${game.id}</td>
                            <td> ${game.price}</td>
                        </c:forEach>
                    </tr>
                </tbody>

            </table>

        </div>



    </body>

    </html>

    </body>

    </html>