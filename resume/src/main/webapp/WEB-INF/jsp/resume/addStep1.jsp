<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/zhilian/reset-min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/zhilian/Person_resumea.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/zhilian/selectCity.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/zhilian/plug_school.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
<script src="${pageContext.request.contextPath}/static/js/zhilian/basedata.js"></script>
</head>
<body>
<div class="top">

        <div class="header clearfix width990">
            <div class="logo fl">
                <a href="http://www.zhaopin.com">
                    <img src="http://img01.zpin.net.cn/2014/c/img/creat_resume/logo.jpg" width="163" height="46" title="好工作上智联招聘" /></a>
            </div>
            <div class="heaer_con fl">
                您正在创建一份个人简历...
                
            </div>
                <div class="heaer_right fr">
                    <a onclick="dyweTrackEvent('Ccreate','COpening07')" href="http://i.zhaopin.com">返回我的智联</a>
                </div>
        </div>
    </div>
    

<div class="main">
    <div class="main01">
        <a onclick="dyweTrackEvent('Ccreate','COpening08')" href="http://i.zhaopin.com/resume/standard/add?language=2&express=">English Resume></a>
    </div>
    <!--创建步骤-->
    <div class="main02">

        <ul>
            <li>
                <span>1. 个人信息 </span>
                <span class="wid216 color01 borradiu"></span>
            </li>
            <li>
                <span>2. 创建简历 </span>
                <span class="wid216 color01"></span>
            </li>
            <li>
                <span>
                    <img src="http://img01.zpin.net.cn/2014/c/img/creat_resume/icon_success.jpg">创建完成
                </span>
                <span class="wid216 color02"></span>
            </li>

        </ul>
    </div>
    <!--form start-->
    <form method="post">
        <div style="display: none;">
            <input type="hidden" name="Language" value="1" />
        </div>
        <!--最近工作/实习经历************-->
        <div class="main04">
            <div class="main04_Pad">
                <h2>最近工作/实习经历</h2>
                <ul class="mainForm mainForm2">
                    <li>
                        <span><font>* </font>是否有工作/实习经验</span>
                        <div class="radio_change radio_change01">
                            <div class="cole current" id="cole01">
                                <input onclick="dyweTrackEvent('Ccreate', 'COpening09')" type="radio" name="haveWorkExpress" id="work_experience_have" checked='checked' value="1" />
                                <label for="work_experience_have">有</label>
                            </div>
                            <div class="cole " id="cole02">
                                <input type="radio" onclick="dyweTrackEvent('Ccreate', 'COpening10')" name="haveWorkExpress"  id="work_experience_no" value="2">
                                <label for="work_experience_no">无</label>
                            </div>
                        </div>
                    </li>
                    <div class="tiggleDiv" style="display:block ">
                        <li class="lenovoLi">
                            <span><font>* </font>公司名称</span>
                            <input type="text" class="wid350 wid408" id="cmpany_name" name="CompanyName" maxlength="255" />
                            <ul class="lenovoUl" id="lenovoUl"></ul>
                            <em id="cmpany_name_msg" class="tips"></em>
                        </li>
                        <li>
                            <span><font>* </font>行业类别</span>
                            <div class="wid350 elePosion work_show">
                                <input type="button" id="industry_type" readonly="readonly">
                                <input type="hidden" value="" id="industry_sub" name="industry_sub">
                                <input type="hidden" value="" id="industry" name="CompanyIndustry">
                                <i class="backSel"></i>
                            </div>
                            <em id="industry_type_msg" class="tips"></em>
                        </li>
                        <li>
                            <span><font>* </font>职位类别</span>
                            <div id="desired_Jobtype_container" class="wid350 elePosion work_show">
                                <input type="button" id="job_type" readonly="readonly">
                                <input type="hidden" value="" id="SchJobType" name="JobType">
                                <input type="hidden" value="" id="subJobType" name="SubJobType">
                                <i class="backSel"></i>
                            </div>
                            <em id="job_type_msg" class="tips"></em>
                        </li>
                        <li>
                            <span><font>* </font>职位名称</span>
                            <input type="text" class="wid350 wid408" id="job_name" name="JobTitle" maxlength="255" />
                            <em id="job_name_msg" class="tips"></em>
                        </li>
                        <li>
                            <span><font>* </font>工作时间</span>
                            <div class="wid60 hei16 elePosion year_show">
                                <input type="text" id="workstart_date_y" name="WorkDateStartYear" readonly="readonly" data="1936|1937|1938|1939|1940|1941|1942|1943|1944|1945|1946|1947|1948|1949|1950|1951|1952|1953|1954|1955|1956|1957|1958|1959|1960|1961|1962|1963|1964|1965|1966|1967|1968|1969|1970|1971|1972|1973|1974|1975|1976|1977|1978|1979|1980|1981|1982|1983|1984|1985|1986|1987|1988|1989|1990|1991|1992|1993|1994|1995|1996|1997|1998|1999|2000|2001|2002|2003|2004|2005|2006|2007|2008|2009|2010|2011|2012|2013|2014|2015"
                                       value="" maxlength="4" class="" placeholder="年">
                                <i class="backDown"></i>
                            </div>
                            <div class="wid60 hei16 elePosion month_show">
                                <input type="text" id="workstart_date_m" name="WorkDateStartMonth" readonly="readonly" data="1|2|3|4|5|6|7|8|9|10|11|12" value="" maxlength="2" class="" placeholder="月">
                                <i class="backDown"></i>
                            </div>
                            <div class="line_1">___</div>
                            <div class="wid60 hei16 elePosion year_show">
                                <input type="text" id="workend_date_y" name="WorkDateEndYear" readonly="readonly" data="1936|1937|1938|1939|1940|1941|1942|1943|1944|1945|1946|1947|1948|1949|1950|1951|1952|1953|1954|1955|1956|1957|1958|1959|1960|1961|1962|1963|1964|1965|1966|1967|1968|1969|1970|1971|1972|1973|1974|1975|1976|1977|1978|1979|1980|1981|1982|1983|1984|1985|1986|1987|1988|1989|1990|1991|1992|1993|1994|1995|1996|1997|1998|1999|2000|2001|2002|2003|2004|2005|2006|2007|2008|2009|2010|2011|2012|2013|2014|2015"
                                       value="" maxlength="4" class="" placeholder="年">
                                <i class="backDown"></i>
                            </div>
                            <div class="wid60 hei16 elePosion month_show">
                                <input type="text" id="workend_date_m" name="WorkDateEndMonth" readonly="readonly" data="1|2|3|4|5|6|7|8|9|10|11|12" value="" maxlength="2" class="" placeholder="月">
                                <i class="backDown"></i>
                            </div>
                            <em id="works_date_msg" class="tips"></em>
                        </li>
                        <li class="msg msg0">
                            <span><font>* </font>职位月薪（税前）</span>
                            <div class="wid350 elePosion ">
                                <input type="text" class="wid350 click_pointer" id="simOption01" name="" value="" style="padding-left: 10px; width: 410px;" placeholder="请选择" readonly="readonly" />
                                <input type="hidden" id="salary_scope" name="Salary" class="hidden_pointer">
                                <i class="backDown"></i>
                                <ul class="eleOption eleOption1">
                                    <li value_submit="0000000000">保密</li>
                                    <li value_submit="0000001000">1000元/月以下</li>
                                    <li value_submit="0100002000">1000-2000元/月</li>
                                    <li value_submit="0200104000">2001-4000元/月</li>
                                    <li value_submit="0400106000">4001-6000元/月</li>
                                    <li value_submit="0600108000">6001-8000元/月</li>
                                    <li value_submit="0800110000">8001-10000元/月</li>
                                    <li value_submit="1000115000">10001-15000元/月</li>
                                    <li value_submit="1500125000">15000-25000元/月</li>
                                    <li value_submit="2500199999">25000元/月以上</li>
                                </ul>
                                <!--/.eleOption-->
                            </div>
                            <em id="simOption01_msg" class="tips"></em>
                        </li>
                        <li class="msg" style="height: 105px; overflow: hidden">
                            <span><font>* </font>工作描述</span>
                            <div style="border: none">
                                <textarea lang="en" id="comment" name="WorkDescription" class="decTxt" style="width: 328px; height: 80px; border-color: #ccc; padding: 10px 82px 10px 10px;" onfocus="fc(this.innerHTML);" onblur="bl(this.value);" maxlength="3000">请详细描述您的职责范围，工作任务以及取得的成绩等。</textarea>
                            </div>
                            <em id="comment_msg" class="tips"></em>
                        </li>
                        <li style="overflow: hidden; height: 80px; line-height: 25px; text-align: right; width: 386px; margin: 0 auto; padding-right: 155px;" id="addExampleLi01" class="addExampleLi">
                            <p id="work_desc_length" class="ege_p1" style="color: #c7c7c7">您还可以输入<font color="#fd6805">3000</font>字</p>
                            <p id="example_work_desc" class="ege_p1 btnExample" style="color: #333333"><span onclick="dyweTrackEvent('Ccreate', 'COpening11')">显示示例</span></p>
                            <textarea name="" id="addExample" class="addExample" readonly="true"></textarea>
                            <p style="color: #333; text-align: left; margin-top: 8px;">简历创建成功后，您可以在“完善简历”时添加多份工作经历</p>
                        </li>
                    </div>
                </ul>
            </div>
            <!--/.main04_Pad-->
        </div>
        <!--/.main04-->
        <!--教育经历**************-->
        <div class="main04">
            <div class="main04_Pad">
                <h2>教育经历</h2>
                <ul class="mainForm mainForm2">
                    <li class="hei44 indexLi01">
                        <span><font>* </font>学历/学位</span>
                        <div class="wid350 elePosion work_show">
                            <input type="text" id="simOption02" class="click_pointer" name="" placeholder="请选择" readonly="readonly"><i class="backDown"></i>
                            <input type="hidden" id="degree" name="EducationLevel" class="hidden_pointer">
                            <ul class="eleOption eleOption2">
                                <li index="1" value_submit="5" datetime="3">大专</li>
                                <li index="2" value_submit="4" datetime="4">本科</li>
                                <li index="3" value_submit="3" datetime="3">硕士</li>
                                <li index="4" value_submit="1" datetime="3">博士</li>
                                <li index="5" value_submit="10">MBA</li>
                                <li index="6" value_submit="11">EMBA</li>
                                <li index="7" value_submit="12">中专</li>
                                <li index="8" value_submit="13">中技</li>
                                <li index="9" value_submit="7">高中</li>
                                <li index="10" value_submit="9">初中</li>
                                <li index="11" value_submit="8">其他</li>
                            </ul>
                            <!--/.eleOption-->
                        </div>
                        <em id="simOption02_msg" class="tips"></em>
                    </li>
                    <li>
                        <span><font>* </font>是否统招</span>
                        <div class="radio_change radio_change02">
                            <div class="cole">
                                <input type="radio" name="IsTongZhao" id="unified_y" value="y">
                                <label for="unified_y">是</label>
                            </div>
                            <div class="cole">
                                <input type="radio" name="IsTongZhao" id="unified_n" value="n">
                                <label for="unified_n">否</label>
                            </div>
                        </div>
                        <em id="full_school_msg" class="tips"></em>
                    </li>
                    <li class="indexLi02">
                        <span><font>* </font>就读时间</span>
                        <div class="wid60 elePosion year_show hei16 eleIndex">
                            <input type="text" id="study_start_date_y" name="EduDateStartYear" readonly="readonly" data="1936|1937|1938|1939|1940|1941|1942|1943|1944|1945|1946|1947|1948|1949|1950|1951|1952|1953|1954|1955|1956|1957|1958|1959|1960|1961|1962|1963|1964|1965|1966|1967|1968|1969|1970|1971|1972|1973|1974|1975|1976|1977|1978|1979|1980|1981|1982|1983|1984|1985|1986|1987|1988|1989|1990|1991|1992|1993|1994|1995|1996|1997|1998|1999|2000|2001|2002|2003|2004|2005|2006|2007|2008|2009|2010|2011|2012|2013|2014|2015"
                                   value="" maxlength="4" class="" placeholder="年">

                            <i class="backDown"></i>
                        </div>
                        <div class="wid60 elePosion month_show hei16 eleIndex">
                            <input type="text" id="study_start_date_m" name="EduDateStartMonth" readonly="readonly" data="1|2|3|4|5|6|7|8|9|10|11|12" value="" maxlength="2" class="" placeholder="月">

                            <i class="backDown"></i>
                        </div>
                        <div class="line_1">___</div>
                        <div class="wid60 elePosion year_show hei16 eleIndex">
                            <input type="text" id="study_end_date_y" name="EduDateEndYear" readonly="readonly" data="1936|1937|1938|1939|1940|1941|1942|1943|1944|1945|1946|1947|1948|1949|1950|1951|1952|1953|1954|1955|1956|1957|1958|1959|1960|1961|1962|1963|1964|1965|1966|1967|1968|1969|1970|1971|1972|1973|1974|1975|1976|1977|1978|1979|1980|1981|1982|1983|1984|1985|1986|1987|1988|1989|1990|1991|1992|1993|1994|1995|1996|1997|1998|1999|2000|2001|2002|2003|2004|2005|2006|2007|2008|2009|2010|2011|2012|2013|2014|2015" value="" maxlength="4" class="" placeholder="年">
                            <i class="backDown"></i>
                        </div>
                        <div class="wid60 elePosion month_show hei16 eleIndex">
                            <input type="text" id="study_end_date_m" name="EduDateEndMonth" readonly="readonly" data="1|2|3|4|5|6|7|8|9|10|11|12" value="" maxlength="2" class="" placeholder="月">
                            <i class="backDown"></i>
                        </div>
                        <em id="study_date_msg" class="tips"></em>
                    </li>
                    <li>
                        <span><font>* </font>学校名称</span>
                        <input type="text" class="wid350 wid408" id="school_name" name="SchoolName" maxlength="255" />
                        <input type="hidden" name="">
                        <em id="school_name_msg" class="tips"></em>
                    </li>
                    <li>
                        <span><font>* </font>专业名称</span>
                        <input type="text" class="wid350 wid408" id="profession_name" name="MajorName" maxlength="255" />
                        <input type="hidden" name="MajorType">
                        <input type="hidden" name="MajorSubType">
                        <em id="profession_name_msg" class="tips"></em>
                    </li>
                </ul>
            </div>
            <!--/.main04_Pad-->
        </div>
        <!--/.main04-->
        <!--求职意向**************-->
        <div class="main04">
            <div class="main04_Pad">
                <h2>求职意向</h2>
                <ul class="mainForm mainForm2">
                    <li>
                        <span><font>* </font>期望工作性质</span>
                        <div class="radio_change radio_change03 property">
                            <input type="checkbox" id="work_type_full" value="2"><label for="work_type_full">全职</label>
                            <input type="checkbox" id="work_type_part" value="1"><label for="work_type_part">兼职</label>
                            <input type="checkbox" id="work_type_cadet" value="4"><label for="work_type_cadet">实习</label>
                            <input id="work_type_values" name="DesiredEmploymentType" type="hidden">
                        </div>
                        <em id="work_type_msg" class=""></em>
                    </li>
                    <li>
                        <span><font>* </font>期望工作地点</span>
                        <div class="wid350 elePosion work_show">
                            <input type="button" id="desired_City" name="DesiredCityName" readonly="readonly">
                            <input type="hidden" name="DesiredCity" value="">
                            <i class="backSel"></i>
                        </div>
                        <em id="desired_City_msg" class="tips"></em>
                    </li>
                    <li>
                        <span><font>* </font>期望从事行业</span>
                        <div class="wid350 elePosion work_show" id="desired_Industry_div">
                            <input type="button" id="button_industryF" name="button_industryF" readonly="readonly"><i class="backSel"></i>
                            <input type="hidden" id="desired_Industry_super" value="" name="desired_Industry_super">
                            <input type="hidden" id="desired_Industry" value="" name="DesiredIndustry">
                        </div>
                        <em id="desired_industry_msg" class="tips"></em>
                    </li>
                    <li>
                        <span><font>* </font>期望从事职业</span>
                        <div class="wid350 elePosion work_show" id="desired_Jobtype_div">
                            <input type="button" id="desired_Jobtype_show" name="DesiredJobTypeName" readonly="readonly"><i class="backSel"></i>
                            <input type="hidden" id="desired_Jobtype_id" value="" name="desired_Jobtype_id">
                            <input type="hidden" id="desired_Jobtype" value="" name="DesiredJobType">
                        </div>
                        <em id="desired_Jobtype_msg" class="tips"></em>
                    </li>
                    <li class="indexLi01">
                        <span><font>* </font>期望月薪（税前）</span>
                        <div class="wid350 elePosion work_show">
                            <input type="text" id="simOption03" class="click_pointer" name="" placeholder="请选择" readonly="readonly"><i class="backDown"></i>
                            <input type="hidden" id="expected_salary" class="hidden_pointer" name="DesiredSalaryScope" value="">
                            <ul class="eleOption eleOption3">
                                
                                <script type="text/javascript">
                                    BaseData.RenderSalaryScopeForStandardAdd(language);
                                </script>
                            </ul>
                            <!--/.eleOption-->
                        </div>
                        <em id="simOption03_msg" class="tips"></em>
                    </li>
                    <li class="indexLi02">
                        <span><font>* </font>工作状态</span>
                        <div class="wid350 elePosion work_show" style="z-index: 0">
                            <input type="text" id="simOption04" class="click_pointer" name="" value="我目前处于离职状态，可立即上岗" readonly="readonly"><i class="backDown"></i>
                            <input type="hidden" id="date_availability" class="hidden_pointer" name="CurrentCareerStatus" value="1">
                            <ul class="eleOption eleOption4">
                                
                                <script type="text/javascript">
                                    BaseData.RenderCurrentCareerStatusForStandardAdd(language);
                                </script>
                            </ul>
                            <!--/.eleOption-->
                        </div>
                        <em id="simOption04_msg" class="tips right_tips"></em>
                    </li>
                    <li style="padding-left: 164px;" class="lastLi">
                        <p class="check_p">
                            <input type="checkbox" id="check1" name="ShowResumeAttend" checked="checked"><label for="check1"> &nbsp;将此求职意向显示在我的简历中</label>
                        </p>
                    </li>
                </ul>
            </div>
            <!--/.main04_Pad-->
        </div>
        <!--/.main04-->
      <div class="main05">  <input type="button" onclick="dyweTrackEvent('Ccreate', 'COpening13')" value="创建完成" class="submitBot"></div>
    </form>
    <!--page util js-->
    <script src="http://img01.zhaopin.cn/2014/common/js/zpidc.utils.js"></script>
    <script src="http://img01.zhaopin.cn/2014/common/js/window.dialog.02.js "></script>
    <script src="http://img01.zhaopin.cn/2014/rd2/js/initSelector.js"></script>
    <script src="http://img01.zhaopin.cn/2014/common/js/validate/ZPIDC.validate_1.0.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/jquery.popup.js"></script>

    <!--page basedata js-->
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/jobIndustryData.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/majorData.js"></script>

    <!--page fun js-->
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/selectIndustry.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/zpJobCateMgr.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/dateselect.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/city.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/selectCity.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/school.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/autoSchoolName.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/autoMajorName.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/standardResumeVali.js"></script>
    <script src="http://img01.zpin.net.cn/2014/c/js/creat_resume/initResumeWedget.js"></script>
</div>
<style rel="stylesheet" href="http://img01.zhaopin.cn/2014/common/css/mask-layer-fixed.css">
    /*遮罩*/
    .global-mask-container, .part-mask-container
    {
        z-index: 200;
        position: absolute;
        left: 0px;
        top: 0px;
        opacity: 0.5;
        background-color: #B3B3B3;
        filter: alpha(opacity=50);
    }

    .part-mask-container
    {
        z-index: 300;
    }

    .global-mask-content, .part-mask-content
    {
        visibility: visible;
        position: fixed;
        z-index: 201;
    }

    .part-mask-content
    {
        width: 315px;
        text-align: center;
        padding-bottom: 30px;
        background: url(http://img01.zhaopin.cn/2014/rd2/img/sysLoading.gif) no-repeat scroll 0 bottom;
        z-index: 301;
    }
</style>

    <div id="footer">
        <div class="footer width990 clearfix">
            <div class="footer01 wid155 fl">
                <img src="http://img01.zpin.net.cn/2014/c/img/creat_resume/icon_01.jpg">
                <p><b>400-885-9898</b></p>
            </div>
            <div class="footer02 wid155 fl">
                <a onmousedown="return AdsClick(121115223,'zhilianjieshao')" target="_blank" href="http://special.zhaopin.com/sh/2009/aboutus/about.html">智联介绍</a>
                <a target="_blank" href="http://www.zhaopin.com/sitemap.html">网站地图</a>
                <a onmousedown="return AdsClick(121115223,'jiaruzhilian')" target="_blank" href="http://special.zhaopin.com/sh/2009/aboutus/join.html" rel="nofollow">加入智联</a>
                <a onmousedown="return AdsClick(121115223,'lianxifangshi')" target="_blank" href="http://special.zhaopin.com/sh/2009/aboutus/contact.html">联系方式</a>


            </div>
            <div class="footer03 wid155 fl">

                <a onmousedown="return AdsClick(121115223,'falvshengming')" target="_blank" href="http://special.zhaopin.com/sh/2009/aboutus/law.html" rel="nofollow">法律声明</a>
                <a onmousedown="return AdsClick(121115223,'baomichengnuo')" target="_blank" href="http://special.zhaopin.com/sh/2009/aboutus/secrecy.html" rel="nofollow">保密承诺</a>
                <a onmousedown="return AdsClick(121115223,'changjianwenti')" target="_blank" href="http://jobseeker.zhaopin.com/zhaopin/faq/question.html">常见问题</a>
                <a onmousedown="return AdsClick(121115223,'touzizheguanxi')" target="_blank" href="http://ir.zhaopin.com" rel="nofollow">Investor Relations</a>
            </div>
            <div class="footer04 fl">

                <p>您对 Zhaopin.com 有任何建议或意见请联系我们，未经zhaopin.com 同意，不得转载本网站之所有招聘信息及作品 智联招聘网版权所有© 1997-2014</p>

                <p class="copyriPad">
                    京ICP备12025925号 电信业务审批[2001]字第233号函 京公网安备
                </p>
                <p>110105000322</p>
            </div>

        </div>
    </div>
    <script type="text/javascript" src="http://img01.zhaopin.cn/2014/common/js/za/ga.js"></script>
    <script src="http://img01.zhaopin.cn/2014/common/js/index_ads.js"></script>
</body>
</html>