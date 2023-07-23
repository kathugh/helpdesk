<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>List Tickets Page</title>		
	</head>
	<body>
		<div class="container">
			<h1>Your Tickets</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>subject</th>
						<th>description</th>
						<th>category</th>
						<th>requester</th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${tickets}" var="ticket">
						<tr>
							<td>${ticket.ticketId}</td>
							<td>${ticket.subject}</td>
							<td>${ticket.description}</td>
							<td>${ticket.category}</td>
							<td>${ticket.requester}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-ticket" class="btn btn-success">New Ticket</a>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		
	</body>
</html>