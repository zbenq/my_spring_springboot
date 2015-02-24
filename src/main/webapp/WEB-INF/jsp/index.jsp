<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html ng-app>
	<head>
		<title>首页</title>
		<script src="http://cdn.bootcss.com/angular.js/1.0.8/angular.min.js"></script>
    	<script type="text/javascript">
    	function Hello($scope, $http) {
    	    $http.get('greeting').
    	        success(function(data) {
    	            $scope.greeting = data;
    	        });
    	}
    	</script>
	</head>

	<body>
		<div ng-controller="Hello">
			<p>The ID is {{greeting.id}}</p>
			<p>The content is {{greeting.name}}</p>
		</div>
	</body>
</html>
