<#import "parts/page.ftl" as p>

<@p.page "Сделки">
<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false"
   aria-controls="collapseExample">
    Добавить запись о покупателе
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">
                <input type="text" class="form-control" name="buyerIdentifier" placeholder="Введите ID покупателя">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="buyerInitials"
                       placeholder="Введите ФИО покупателя">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="buyerAddress"
                       placeholder="Введите адрес покупателя">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="buyerPhoneNumber"
                       placeholder="Введите номер телефона покупателя">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </form>
    </div>
</div>
<h5>Информация о покупателях</h5>
<table class="table table-bordered">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">ID покупателя</th>
        <th scope="col">ФИО покупателя</th>
        <th scope="col">Адрес покупателя</th>
        <th scope="col">Номер телефона покупателя</th>
    </tr>
    </thead>
    <tbody>
    <#list buyers as buyer>
    <tr>
        <th scope="row"><b>${buyer.id}</b></th>
        <td>${buyer.buyerIdentifier}</td>
        <td>${buyer.buyerInitials}</td>
        <td>${buyer.buyerAddress}</td>
        <td>${buyer.buyerPhoneNumber}</td>
    </tr>
    </#list>
    </tbody>
</table>
</@p.page>