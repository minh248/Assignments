$(document).ready(function () {
    buildTable()
})

function buildTable() {
    $.get("http://127.0.0.1:8080/api/v1/group", function (data, status) {
        for (group of data) {
            $("table").append("<tr>" +
                "<td>" + group.id + "</td>" +
                "<td>" + group.name + "</td>" +
                "<td>" + group.member + "</td>" +
                "<td>" + group.creator + "</td>" +
                "<td>" + group.createDate + "</td>" +
                "<th>\n" +
                "<a onclick='showEditForm("+ group.id +")' href='#edit-form'>Edit</a>\n" +
                "<a onclick='deleteGroup("+ group.id +")'>Delete</a>\n" +
                "</th>" +
                "</tr>"
            )
        }
    })
}

function showEditForm(id) {
    $("#edit-form").css("display", "block")
    $("input[name='id']").val(id)
}

function editGroup() {
    var id = $("input[name='id']").val()

    var d = {
        name: $("input[name='name1']").val(),
        member: $("input[name='member1']").val(),
        creator: $("input[name='creator1']").val(),
        createDate: $("input[name='createDate1']").val()
    }

    $.ajax({
        url: 'http://127.0.0.1:8080/api/v1/group/' + id,
        type: 'put',
        dataType: 'json',
        contentType: 'application/json',
        success: function () {
            alert("created")
            reload()
        },
        data: JSON.stringify(d)
    });
}

function deleteGroup(id) {
    $.ajax({
        url: 'http://127.0.0.1:8080/api/v1/group/' + id,
        type: 'DELETE',
        success: function() {
            alert('deleted group with id ' + id)
            reload()
        }
    });
}


function createGroup() {
    var d = {
        name: $("input[name='name']").val(),
        member: $("input[name='member']").val(),
        creator: $("input[name='creator']").val(),
        createDate: $("input[name='createDate']").val()
    }

    $.ajax({
        url: 'http://127.0.0.1:8080/api/v1/group',
        type: 'post',
        dataType: 'json',
        contentType: 'application/json',
        success: function () {
            alert("created")
            reload()
        },
        data: JSON.stringify(d)
    });
}

function reload() {
    window.location.href = "http://localhost:63343/crud_frontend/index.html"
}


// function save() {
//     $(".edit-container").css("display", "none")
//     alert("update")
//     // send update request
// }