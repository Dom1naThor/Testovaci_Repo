*** Settings ***
Library    Browser
Resource     keywords/login_keywords.robot

*** Variables ***
# ${username}    "Ján Dubčák"
# ${user_email}    "Ján Dubčák"
# ${user_pass}    "Ján Dubčák"
${ispo_url}     https://ispo.planobnovy.sk/app/vyzvy
${ispo_url_preprod}     https://portal-ui-preprod.ispo.dev/app/vyzvy
${CSS_HEADER_MAIN}    div[class="idsk-header-web__main"]

*** Test Cases ***
Login planobnovy
    New Browser     browser=chromium     headless=${False}
    New page    ${ispo_url}
    Valid Login    username=Ján Dubčák    ico=${EMPTY}    user_email=dominik.spacek@vlada.gov.sk    user_pass=Customurad432/
    Logout
    
Login planobnovy moj 2
    New Browser    browser=chromium     headless=${False}
    New page    ${ispo_url_preprod}
    Valid Login    username=Tales motor s.r.o.   ico=(18345678)    user_email=tales-motor-18@docasnyemail.sk    user_pass=Vizibilita5*
    Logout
    
Login planobnovy moj 3
    New Browser    browser=chromium     headless=${False}
    New page    ${ispo_url_preprod}
    Valid Login    username=Dominik Špaček   ico=${EMPTY}     user_email=dominik.spacek@vlada.gov.sk    user_pass=Customurad432/
    Logout

Login planobnovy moj 4
    New Browser     browser=chromium     headless=${False}
    New page    ${ispo_url_preprod}
    Valid Login with subject selection     ico=(98989898)    subjekt=Buffalo&Staff s.r.o.      user_email=dominik.spacek@vlada.gov.sk    user_pass=Customurad432/
    Logout
