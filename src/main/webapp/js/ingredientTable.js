/*global console, alert, confirm, prompt*/
$(document).ready(function() {
    var $name = $('input[name="name"]'),
        $model = $('input[name="model"]'),
        $year = $('input[name="year"]'),
        $price = $('input[name="price"]'),
        $color = $('input[name="color"]');
    $name.focus();
    $('table').on('click', 'th', function() {
        var $table = $('table'),
            $index = $(this).index();
        $table.find('tbody tr').not(':last-child').each(function() {
            $(this).children().each(function(i, e) {
                if ($(e).index() === $index) {
                    $(e).css({
                        'color': '#BCE7FD',
                        'background': '#414744'
                    });
                    $(e).nextAll().css({
                        'color': '',
                        'background': ''
                    });
                    $(e).prevAll().css({
                        'color': '',
                        'background': ''
                    });
                }
            });
        });
        // colors
        $(this).css('background', '#3F88C5');
        $(this).nextAll().css('background', '');
        $(this).prevAll().css('background', '');
    });

    $('table').on('click', 'tr:not(:last-child) td', function() {
        $(this).parent().children().toggleClass('this').css({
            'color': '',
            'background': ''
        });
        $(this).parent().nextAll().children().removeClass('this').css({
            'color': '',
            'background': ''
        });
        $(this).parent().prevAll().children().removeClass('this').css({
            'color': '',
            'background': ''
        });
    });

    $('#remove').on('click', function() {
        $('table').find('.this').parent().fadeOut('normal', function() {
            $(this).remove();
        });
    });
    $('#add').on('click', function() {
        var el = '<tr> <td>' + $name.val() +
                '</td> <td>' + $model.val() +
                '</td> <td>' + $year.val() +
                '</td> <td>' + $price.val() +
                '</td> <td>' + $color.val() + '</td> </tr>',
            $el = $(el);
        if ($name.val().trim() === '' || $model.val().trim() === '' ||
            $year.val().trim() === '' || $price.val().trim() === '' || $color.val().trim() === '') {
            return false;
        } else {
            $el.insertBefore('#inputs');
            $name.val('');
            $model.val('');
            $year.val('');
            $price.val('');
            $color.val('');
            $name.focus();
        }

    });
});/**
 * Created by Kanibal on 23.05.2017.
 */
