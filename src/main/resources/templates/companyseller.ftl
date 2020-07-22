<#import "parts/page.ftl" as p>

<@p.page "Предприятия-продавцы">
<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false"
   aria-controls="collapseExample">
    Добавить запись о предприятии
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">
                <input type="text" class="form-control" name="companySellerTaxpayerIdentificationNumber"
                       placeholder="Введите ИНН предприятия-продавца">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="companySellerName"
                       placeholder="Введите название предприятия-продавца">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="companySellerAddress"
                       placeholder="Введите адрес предприятия-продавца">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="controllingStakeValue"
                       placeholder="Введите размер контрольного пакета акций">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="sharesToSellNumber"
                       placeholder="Введите количество акций к продаже">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="sharePrice" placeholder="Введите цену одной акции">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </form>
    </div>
</div>
<h5>Информация о компаниях-продавцах</h5>
<table class="table table-bordered">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">ИНН предприятия-продавца</th>
        <th scope="col">Название предприятия-продавца</th>
        <th scope="col">Адрес предприятия-продавца</th>
        <th scope="col">Размер контрольного пакета акций</th>
        <th scope="col">Количество акций к продаже</th>
        <th scope="col">Цена одной акции</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <#list companySellers as companyseller>
    <tr>
        <th scope="row"><b>${companyseller.id}</b></th>
        <td>${companyseller.companySellerTaxpayerIdentificationNumber}</td>
        <td>${companyseller.companySellerName}</td>
        <td>${companyseller.companySellerAddress}</td>
        <td>${companyseller.controllingStakeValue}</td>
        <td>${companyseller.sharesToSellNumber}</td>
        <td>${companyseller.sharePrice}</td>
        <td>
            <form method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <a class="btn btn-secondary" href="#">Изменить</a>
                </div>
            </form>
        </td>
        <td>
            <form method="post" action="/companyseller/delete/${companyseller.companySellerTaxpayerIdentificationNumber}"
                  enctype="multipart/form-data">
                <button type="submit" class="btn btn-secondary">Удалить</button>
            </form>
        </td>
    </tr>
    </#list>
    </tbody>
</table>
</@p.page>

