<script src="static/bower_components/jquery/dist/jquery.min.js"></script>
<script src="static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="static/bower_components/fastclick/lib/fastclick.js"></script>
<script src="static/dist/js/adminlte.min.js"></script>
<script src="static/dist/js/jquery.inputmask.bundle.js"></script>
<script
	src="static/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<script src="static/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
	src="static/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
	src="static/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="static/bower_components/chart.js/Chart.js"></script>
<script src="static/dist/js/pages/dashboard2.js"></script>
<script src="static/dist/js/demo.js"></script>


<!-- jQuery UI 1.11.4 -->
<script src="static/bower_components/jquery-ui/jquery-ui.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
	$.widget.bridge('uibutton', $.ui.button);
</script>

<!-- DataTables -->
<script
	src="static/bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
<script
	src="static/bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>

<script>
	$(function() {
		$('#example1').DataTable()
		$('#example2').DataTable({
			'paging' : true,
			'lengthChange' : false,
			'searching' : false,
			'ordering' : true,
			'info' : true,
			'autoWidth' : false
		})
	})
</script>