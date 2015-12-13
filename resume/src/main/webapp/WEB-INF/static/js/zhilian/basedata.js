var cardType=[{"Code":"1","NameCn":"身份证","NameEn":"Personal ID Card"},{"Code":"2","NameCn":"护照","NameEn":"Passport"},{"Code":"3","NameCn":"军官证","NameEn":"Military ID Card"},{"Code":"7","NameCn":"香港身份证","NameEn":"Hong kong identity card"},{"Code":"8","NameCn":"澳门身份证","NameEn":"Macao identity card"},{"Code":"5","NameCn":"港澳通行证","NameEn":"laissez-passer to Hongkong & Macao"},{"Code":"6","NameCn":"台胞证","NameEn":"Mainland Travel Permit for Taiwan Residents"},{"Code":"4","NameCn":"其他","NameEn":"Other"}]
var maritalStatus=[{"Code":"1","NameCn":"未婚","NameEn":"Single"},{"Code":"2","NameCn":"已婚","NameEn":"Married"},{"Code":"3","NameCn":"离异","NameEn":"Divorced"}]
var political=[{"Code":"1","NameCn":"中共党员(含预备党员) ","NameEn":"Party Member"},{"Code":"5","NameCn":"团员","NameEn":"League member"},{"Code":"6","NameCn":"群众","NameEn":"Citizenship"},{"Code":"2","NameCn":"民主党派","NameEn":"Party"},{"Code":"3","NameCn":"无党派人士","NameEn":"No Party"}]
var overseasYear = [{ "Code": "1", "NameCn": "1年", "NameEn": "1 Year" }, { "Code": "2", "NameCn": "2年", "NameEn": "2 Year" }, { "Code": "3", "NameCn": "3年", "NameEn": "3 Year" }, { "Code": "4", "NameCn": "4年", "NameEn": "4 Year" }, { "Code": "5", "NameCn": "5年", "NameEn": "5 Year" }, { "Code": "6", "NameCn": "5-10年", "NameEn": "5-10 Year" }, { "Code": "10", "NameCn": "10年以上", "NameEn": "Above 10 Year" }]
var employmentType = [{ "Code": "2", "NameCn": "全职", "NameEn": "Full-time" }, { "Code": "1", "NameCn": "兼职", "NameEn": "Part-time" }, { "Code": "4", "NameCn": "实习", "NameEn": "Intern" }]
var salaryScope = [{ "Code": "0000001000", "NameCn": "1000元\/月以下", "NameEn": "Below 1000RMB\/Month" }, { "Code": "0100002000", "NameCn": "1000-2000元\/月", "NameEn": "1000-2000RMB\/Month" }, { "Code": "0200104000", "NameCn": "2001-4000元\/月", "NameEn": "2001-4000RMB\/Month" }, { "Code": "0400106000", "NameCn": "4001-6000元\/月", "NameEn": "4001-6000RMB\/Month" }, { "Code": "0600108000", "NameCn": "6001-8000元\/月", "NameEn": "6001-8000RMB\/Month" }, { "Code": "0800110000", "NameCn": "8001-10000元\/月", "NameEn": "8001-10000RMB\/Month" }, { "Code": "1000115000", "NameCn": "10001-15000元\/月", "NameEn": "10001-15000RMB\/Month" }, { "Code": "1500125000", "NameCn": "15000-25000元\/月", "NameEn": "15000-25000RMB\/Month" }, { "Code": "2500199999", "NameCn": "25000元\/月以上", "NameEn": "Above 25000RMB\/Month" }, { "Code": "0000000000", "NameCn": "面议", "NameEn": "Confidential" }]
var careerStatus = [{ "Code": "1", "NameCn": "我目前处于离职状态，可立即上岗", "NameEn": "Immediately" }, { "Code": "2", "NameCn": "我目前在职，正考虑换个新环境（如有合适的工作机会，到岗时间一个月左右）", "NameEn": "In 1 months" }, { "Code": "4", "NameCn": "我对现有工作还算满意，如有更好的工作机会，我也可以考虑。（到岗时间另议）", "NameEn": "In 6 months" }, { "Code": "3", "NameCn": "目前暂无跳槽打算", "NameEn": "Not specified" }, { "Code": "5", "NameCn": "应届毕业生", "NameEn": "student" }]
var BaseData = (function () {
    var GetData = function (type) {
        var data;
        switch (type) {
            case "cardtype":
                data = cardType;
                break;
            case "marital":
                data = maritalStatus;
                break;
            case "political_status":
                data = political;
                break;
            case "overseasyear":
                data = overseasYear;
                break;
            case "employmenttype":
                data = employmentType;
                break;
            case "expected_salary":
                data = salaryScope;
                break;
            case "careerstatus":
                data = careerStatus;
                break;
            default:
        }
        return data;
    }

    var RenderRadio = function (type,current,language) {
        var data = GetData(type);
        for (var o in data) {
            var item = data[o];
            var name = language == 1 ? item.NameCn : item.NameEn;
            if (item.Code == current) {
                document.write("<input type='Radio' name='" + type + "' value='" + item.Code + "' checked='checked' />" + name);
            } else {
                document.write("<input type='Radio' name='" + type + "' value='" + item.Code + "' />" + name);
            }
        }
    };
    var RenderCheckBox = function (type, current,name, language) {
        var data = GetData(type);
        for (var o in data) {
            var item = data[o];
            var title = language == 1 ? item.NameCn : item.NameEn;
            if (current.indexOf(item.Code) <0) {
                document.write("<input type='CheckBox' name='" + name + "' value='" + item.Code + "' />" + title);
            } else {
                document.write("<input type='CheckBox' name='" + name + "' value='" + item.Code + "' checked='checked' />" + title);
               
            }
        }
    };
    var RenderSelect = function (type, current, language) {
        var data = GetData(type);
        for (var o in data) {
            var item = data[o];
            var name = language == "1" ? item.NameCn : item.NameEn;
            if (item.Code == current) {
                document.writeln("<option value='" + item.Code + "'selected='selected'>" + name + "</option>");
            } else {
                document.writeln("<option value='" + item.Code + "'>" + name + "</option>");
            }
        }
    };
    var IdTypeSelect = function (type, current, language) {
        var data = GetData(type);
        for (var o in data) {
            var item = data[o];
            var name = language == "1" ? item.NameCn : item.NameEn;
            document.writeln("<a def-value='" + item.Code + "' href='javascript:void(0);' title='"+name+"'  >" + name + "</a>");
            
        }
    }; 

	
	//For Standard Resume Add
    var RenderCurrentCareerStatusForStandardAdd = function (language) {
        var data = GetData("careerstatus");
        for (var o in data) {
            var item = data[o];
            var name = language == "1" ? item.NameCn : item.NameEn;
            /*因为在IE和FF中li的value属性的值如果是形式如0100会被自动转成100，所以把value改成value_submit*/
            document.writeln("<li title='" + name + "' value_submit='" + item.Code + "'>" + name + "</li>");
        }
    };
    var RenderSalaryScopeForStandardAdd = function (language) {
        var data = GetData("expected_salary");
        for (var o in data) {
            var item = data[o];
            var name = language == "1" ? item.NameCn : item.NameEn;
            document.writeln("<li title='" + name + "' value_submit='" + item.Code + "'>" + name + "</li>");
        }
    };
	
	
    return{
        RenderRadio: RenderRadio,
        RenderSelect: RenderSelect,
        IdTypeSelect:IdTypeSelect,
        RenderCheckBox: RenderCheckBox,
        RenderCurrentCareerStatusForStandardAdd: RenderCurrentCareerStatusForStandardAdd,
        RenderSalaryScopeForStandardAdd: RenderSalaryScopeForStandardAdd
    };
})();