<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="./_resources/estiloLogin.css">
    <title>Login</title>
  </head>
  <body>
    <section>
      <div id="principal" class="form-group">
				<div id="titulo">
					<h1>Manutenção</h1>
        </div>

        <form action="Login" method="post" id="formlogin">
          <div id="username">
            <input class="form-control" type="text" name="user" placeholder="Usuário">
          </div>

          <div id="pass">
            <input class="form-control" type="password" name="senha" placeholder="Senha">
          </div>

          <div id="botao">
            <button id="botaologin" class="btn btn-primary" type="submit" name="login">Entrar</button>
          </div>
        </form>
      </div>
      </section>

  </body>
</html>

