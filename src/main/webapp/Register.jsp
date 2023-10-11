<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Cyber Dojo | User Registration</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="assets/img/logo.png" rel="icon">
    <link href="assets/img/logo.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
          rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>

<body style="background-image: url('assets/img/bg1.jpg'); height: 100vh; ">

<div class="container-fluid mt-5 text-white">
    <div class="row">
        <div class="col-lg-12">
            <main class="form-signin" style="margin-left: 35%; margin-right:35%;">
                <form class=" text-dark text-center" action="SignUpServlet" method="post">

                    <b><h1 class="h3 mb-3 fw-normal text-white">REGISTER FOR A NEW ACCOUNT</h1></b>

                    <div class="form-floating mt-3" style="opacity: .7;">
                        <input type="text" class="form-control" id="firstname" name="firstname"
                               placeholder="firstname here">
                        <label for="firstname">First Name</label>
                    </div>

                    <div class="form-floating mt-3" style="opacity: .7;">
                        <input type="text" class="form-control" id="lastname" name="lastname"
                               placeholder="lastname here">
                        <label for="lastname">Last Name</label>
                    </div>
                    <div class="form-floating mt-3" style="opacity: .7;">
                        <input type="email" class="form-control" id="email" name="email" placeholder="email here">
                        <label for="email">email</label>
                    </div>
                    <div class="form-floating mt-3" style="opacity: .7;">
                        <input type="text" class="form-control" name="username" id="username" placeholder="username here">
                        <label for="username">Username</label>
                    </div>
                    <div class="form-floating mt-3" style="opacity: .7;">
                        <input type="password" class="form-control" id="password" name="password"
                               placeholder="Password">
                        <label for="password">Password</label>
                    </div>

                    <div class="checkbox mb-3 mt-3">
                        <label class="text-white">
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                    <button class="w-100 btn btn-lg btn-outline-danger" type="submit">Register</Button>
                </form>
            </main>
        </div>
    </div>
</div>


<!-- Vendor JS Files -->
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
<script src="assets/vendor/php-email-form/validate.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>

</body>

</html>