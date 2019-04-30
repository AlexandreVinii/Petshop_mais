<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="/head-res.jsp"%>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<%@include file="/header.jsp"%>
		<%@include file="/aside.jsp"%>

		<section class="content-wrapper" id="content">

			<div class="box box-info">
				<div class="box-header with-border">
					<h3 class="box-title">Cadastrar novo Produto</h3>
				</div>

				<div class="box-body">
					<form method="POST">
						<div class="row">
							<div class="col-lg-12 col-md-12">

								Obs: <small> Formulário para cadastro de novos Produtos
									no sistema. <br>Aqui você pode efetuar um cadastro e caso
									os dados ja existam ou estejam inválidos o sistema mesmo irá
									lhe alerta-lo(a).
								</small>
								<hr>
							</div>
							<div class="col-md-6">

								<div class="col-xs-6 col-md-6 col-lg-6">
									<div class="form-group">
										<label id="asasdas">Codigo do Produto</label><br> <input
											type="text" class="form-control" name="Nome">
									</div>
								</div>
								<div class="col-xs-6 col-md-6 col-lg-6">
									<div class="form-group">
										<label id="dsa">Nome</label><br> <input type="text"
											class="form-control" name="Nome">
									</div>
								</div>
								<div class="col-xs-6 col-md-6 col-lg-6">
									<div class="form-group">
										<label>Valor</label><br> <input type="text"
											class="form-control" name="CPF">
									</div>
								</div>

								<div class="col-xs-6 col-md-6 col-lg-6">
									<div class="form-group">
										<label id="asasdas">Peso</label><br> <input type="text"
											class="form-control" name="DDD">
									</div>
								</div>
								<div class="col-xs-12 col-md-12 col-lg-12">
									<div class="form-group">
										<label id="asasdas">Descrição</label><br> <input
											type="text" class="form-control" name="Número">
									</div>
								</div>

							</div>


						</div>
						<div class="box-footer text-right">
							<button type="submit" class="btn btn-success">Cadastrar</button>
						</div>
					</form>
				</div>
			</div>

		</section>
	</div>














	<%@include file="/script-res.jsp"%>
</body>
</html>