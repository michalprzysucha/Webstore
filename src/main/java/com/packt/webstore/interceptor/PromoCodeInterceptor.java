package com.packt.webstore.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class PromoCodeInterceptor implements HandlerInterceptor {
    private String promoCode;
    private String errorRedirect;
    private String offerRedirect;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String givenPromoCode = request.getParameterValues("promo") == null ? "" : request.getParameterValues("promo")[0];
        if (request.getRequestURI().endsWith("/products/specialOffer")) {
            if (givenPromoCode.equalsIgnoreCase(promoCode)) {
                response.sendRedirect(request.getContextPath() + "/" + offerRedirect);
            }
            else {
                response.sendRedirect(errorRedirect);
            }
            return false;
        }
        return true;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getErrorRedirect() {
        return errorRedirect;
    }

    public void setErrorRedirect(String errorRedirect) {
        this.errorRedirect = errorRedirect;
    }

    public String getOfferRedirect() {
        return offerRedirect;
    }

    public void setOfferRedirect(String offerRedirect) {
        this.offerRedirect = offerRedirect;
    }
}
