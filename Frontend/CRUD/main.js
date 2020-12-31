$(document).ready(function () {
    buildTable()
})

function buildTable() {
    deleteAllEmployee()

    $.get("https://5fbfb63cfd14be0016748f86.mockapi.io/api/v1/employees", function (data, status) {
        for (e of data){
            $("table").append("<tr class='employee-info'>" +
                " <td>"+ e.name +"</td>" +
                "<td>" + e.department + "</td>" +
                "<td>" + e.phone + "</td>" +
                "<a href='#' onclick='editEmployee()'> <i class=\"fas fa-edit\"></i> Edit </a>" +
                "<a href='#' onclick='deleteEmployee("+ e.id +")'> <i class=\"fas fa-trash\"></i> Delete </a>" +
                "</td> " +
                "</tr>")
        }
    })
}

function editEmployee() {
    // put method
    alert("edited")
}

function deleteEmployee(id) {
    $.ajax({
        url: "https://5fbfb63cfd14be0016748f86.mockapi.io/api/v1/employees/" + id,
        type: "DELETE",
        success: function (result) {
            if (result === undefined) {
                alert("Error when loading data")
            }

            buildTable()
        }
    })
}

function deleteAllEmployee() {
    $(document).ready(function () {
        $(".employee-info").remove()
    })
}


function showSuccessAlert() {
    alert("Successfully")
}