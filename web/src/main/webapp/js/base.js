$(document).ready(function () {
    var noticeHeight = $("#notice").height();
    var windowHeight = $(window).height();

    var top = 0;
    var delta = windowHeight - noticeHeight;
    if (delta>0) {
        top = delta * 3 / 8;
    }

    $("#notice").css("position", "relative").css("top", top + "px");
});