function isEmpty(name) {
    if (name == null||name==undefined || $.trim(name) == 'null' || $.trim(name) == '') {
        return true;
    } else {
        return false;
    }
}