<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="/head-res.jsp"%>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<%@include file="/header.jsp"%>
		<%@include file="/aside.jsp"%>
		
		<div class="content-wrapper">
      <!-- Content Header (Page header) -->

      <!-- Main content -->
      <section class="content">
        <div class="col-xs-12">
          <div class="box box-info">
            <div class="box-header">
              <h3 class="box-title">Listagem de Produtos</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div id="example1_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">
                <div class="row">
                  <div class="col-sm-12">
                    <table id="example1" class="table table-bordered table-striped dataTable" role="grid"
                      aria-describedby="example1_info">
                      <thead>
                        <tr role="row">
                          <th class="sorting_asc" tabindex="0" aria-controls="example1" rowspan="1" colspan="1"
                            style="width: 201px;">ID</th>
                          <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1"
                            style="width: 246px;">Codigo do Produto</th>
                          <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1"
                            style="width: 219px;">Nome</th>
                          <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1"
                            style="width: 172px;">Quantidade</th>
                          <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1"
                            style="width: 126px;">Valor</th>
                        </tr>
                      </thead>
                      <tbody>


                        <tr role="row" class="odd">
                          <td class="sorting_1">hpi2178 </td>
                          <td>Produto 1.0</td>
                          <td>Win 98+ / OSX.2+</td>
                          <td>1.7</td>
                          <td>872,54</td>
                        </tr>
                        <tr role="row" class="even">
                          <td class="sorting_1">ous2874</td>
                          <td>Produto 1.5</td>
                          <td>Win 98+ / OSX.2+</td>
                          <td>1.8</td>
                          <td>154,74</td>
                        </tr>
                        <tr role="row" class="odd">
                          <td class="sorting_1">heu18871</td>
                          <td>Produto 2.0</td>
                          <td>Win 98+ / OSX.2+</td>
                          <td>1.8</td>
                          <td>463,49</td>
                        </tr>
                        <tr role="row" class="even">
                          <td class="sorting_1">78w98e</td>
                          <td>Produto 3.0</td>
                          <td>Win 2k+ / OSX.3+</td>
                          <td>1.9</td>
                          <td>123,48</td>
                        </tr>
                        <tr role="row" class="odd">
                          <td class="sorting_1">235ewz</td>
                          <td>Produto X 1.0</td>
                          <td>OSX.2+</td>
                          <td>1.8</td>
                          <td>115,46</td>
                        </tr>
                        <tr role="row" class="even">
                          <td class="sorting_1">235ewzaz</td>
                          <td>Produto X 1.5</td>
                          <td>OSX.3+</td>
                          <td>1.8</td>
                          <td>178,04</td>
                        </tr>
                        <tr role="row" class="odd">
                          <td class="sorting_1">8e7qwko</td>
                          <td>Produto 7.2</td>
                          <td>Win 95+ / Mac OS 8.6-9.2</td>
                          <td>1.7</td>
                          <td>200,58</td>
                        </tr>
                        <tr role="row" class="even">
                          <td class="sorting_1">k2399o</td>
                          <td>Produto Browser 8</td>
                          <td>Win 98SE+</td>
                          <td>1.7</td>
                          <td>258,58</td>
                        </tr>
                        <tr role="row" class="odd">
                          <td class="sorting_1">as99cko</td>
                          <td>Produto Navigator 9</td>
                          <td>Win 98+ / OSX.2+</td>
                          <td>1.8</td>
                          <td>879,15</td>
                        </tr>

                      </tbody>
                      <tfoot>
                        <tr>
                          <th rowspan="1" colspan="1">Id</th>
                          <th rowspan="1" colspan="1">Codigo do Produto</th>
                          <th rowspan="1" colspan="1">Nome</th>
                          <th rowspan="1" colspan="1">Quantidade</th>
                          <th rowspan="1" colspan="1">Valor</th>
                        </tr>
                      </tfoot>
                    </table>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-body -->
          </div>
        </div>
      </section>
      <!-- /.content -->
    </div>
	</div>














	<%@include file="/script-res.jsp"%>
</body>
</html>