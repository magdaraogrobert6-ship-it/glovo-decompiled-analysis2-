package com.braze.ui.inappmessage.config;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeInAppMessageParams {
    public static final double GRAPHIC_MODAL_MAX_HEIGHT_DP = 290.0d;
    public static final double GRAPHIC_MODAL_MAX_WIDTH_DP = 290.0d;
    public static final double MODALIZED_IMAGE_RADIUS_DP = 9.0d;
    public static final BrazeInAppMessageParams INSTANCE = new BrazeInAppMessageParams();
    private static double modalizedImageRadiusDp = 9.0d;
    private static double graphicModalMaxWidthDp = 290.0d;
    private static double graphicModalMaxHeightDp = 290.0d;

    private BrazeInAppMessageParams() {
    }

    public static final double getGraphicModalMaxHeightDp() {
        return graphicModalMaxHeightDp;
    }

    public static /* synthetic */ void getGraphicModalMaxHeightDp$annotations() {
    }

    public static final double getGraphicModalMaxWidthDp() {
        return graphicModalMaxWidthDp;
    }

    public static /* synthetic */ void getGraphicModalMaxWidthDp$annotations() {
    }

    public static final double getModalizedImageRadiusDp() {
        return modalizedImageRadiusDp;
    }

    public static /* synthetic */ void getModalizedImageRadiusDp$annotations() {
    }

    public static final void setGraphicModalMaxHeightDp(double d) {
        graphicModalMaxHeightDp = d;
    }

    public static final void setGraphicModalMaxWidthDp(double d) {
        graphicModalMaxWidthDp = d;
    }

    public static final void setModalizedImageRadiusDp(double d) {
        modalizedImageRadiusDp = d;
    }
}
