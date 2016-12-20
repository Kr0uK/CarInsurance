<%-- 
    Document   : formulaire
    Created on : 13 déc. 2016, 15:04:24
    Author     : RENAUD
--%>
<form class="form-horizontal">
    <fieldset>
        <legend>Formulaire d'inscription</legend>
        <div class="form-group">
            <label class="col-lg-2 control-label" for="inputDefault">Nom</label>
            <div class="col-lg-10">
                <input type="text" class="form-control" id="inputNom" placeholder="Nom">
            </div>
        </div>
        <div class="form-group">
            <label class="col-lg-2 control-label" for="inputDefault">Prénom</label>
            <div class="col-lg-10">
                <input type="text" class="form-control" id="inputPrenom" placeholder="Prénom">
            </div>
        </div>
        <div class="form-group">
            <label class="col-lg-2 control-label" for="inputDefault">Date de naissance</label>
            <div class="col-lg-10 ">
                <input type="text" class="form-control" id="inputDateNaissance" placeholder="Date de naissance">
            </div>
        </div>
        <div class="form-group">
            <label class="col-lg-2 control-label" for="inputDefault">Adresse</label>
            <div class="col-lg-10 ">
                <input type="text" class="form-control" id="inputAdresse" placeholder="Adresse">
            </div>
        </div>
        <div class="form-group">
            <label class="col-lg-2 control-label" for="inputDefault">Ville</label>
            <div class="col-lg-10 ">
                <input type="text" class="form-control" id="inputVille" placeholder="Ville">
            </div>
        </div>
        <div class="form-group">
            <label class="col-lg-2 control-label" for="inputDefault">Code Postal</label>
            <div class="col-lg-10 ">
                <input type="number" class="form-control" id="inputCP" placeholder="Code Postal">
            </div>
        </div>
        <div class="form-group">
            <label for="inputEmail" class="col-lg-2 control-label">Email</label>
            <div class="col-lg-10">
                <input type="text" class="form-control" id="inputEmail" placeholder="Email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="col-lg-2 control-label">Mot de passe</label>
            <div class="col-lg-10">
                <input type="password" class="form-control" id="inputPassword" placeholder="Mot de passe">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="col-lg-2 control-label">Confirmation</label>
            <div class="col-lg-10">
                <input type="password" class="form-control" id="inputConfirmation" placeholder="Confirmation mot de passe">
            </div>
        </div>
        <div class="form-group">
            <label for="select" class="col-lg-2 control-label">Constructeur</label>
            <div class="col-lg-10">
                <select class="form-control" id="constructeur"></select>
            </div>
        </div>
        <div class="form-group">
            <label for="select" class="col-lg-2 control-label">Modèle</label>
            <div class="col-lg-10">
                <select class="form-control" id="modele"></select>
            </div>
        </div>
        <div class="form-group">
            <div class="col-lg-10 col-lg-offset-2">
                <button type="reset" class="btn btn-default" id="btnReset">Cancel</button>
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </fieldset>
</form>