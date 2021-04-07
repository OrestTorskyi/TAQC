package subtasks;

public enum HTTPError {
    BADREQUEST(400),
    UNAUTHORIZED(401),
    PAYMENTREQUIRED(402),
    FORBIDDEN(403),
    NOTFOUND(404);

    private int httpNumber;
    private HTTPError(int httpNumber)
    {
        this.httpNumber = httpNumber;
    }

    public int getHttpNumber() {
        return httpNumber;
    }

    public static String httpDescription(int number)
    {
        String str = null;
        if(number == BADREQUEST.getHttpNumber()) str = "400 Bad Request — Неправильний запит";
        if(number == UNAUTHORIZED.getHttpNumber()) str = "401 Unauthorized — Несанкціонований доступ";
        if(number == PAYMENTREQUIRED.getHttpNumber()) str = "402 Payment Required — Потрібна оплата";
        if(number == FORBIDDEN.getHttpNumber()) str = "403 Forbidden — Заборонено";
        if(number == NOTFOUND.getHttpNumber()) str = "404 Not Found — Не знайдено";
        System.out.println(str);
        return str;
    }
}
