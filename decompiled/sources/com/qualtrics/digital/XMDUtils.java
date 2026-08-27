package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
public class XMDUtils {
    private static final String contactFrequencyRetrierName = "ContactFrequencyRetrier";
    private static XMDUtils instance = null;
    private static final String targetingRetrierName = "TargetingRetrier";
    static String xmdRetryResponseKey = "XMD_RETRY";
    String brandDC;
    String brandId;
    public BackOffRetrier contactFrequencyRetrier;
    String extRefId;
    public boolean isXMDContactAnonymous;
    private IBackOffRetrierFormulaCallback retryBackOffFormula;
    public BackOffRetrier targetingRetrier;
    private int targetingRetryLimit = 4;
    private int contactFrequencyRetryLimit = 3;

    public void setXMDImpressionTouchpointParams(String str, String str2, String str3) {
        this.extRefId = str;
        this.brandId = str2;
        this.brandDC = str3;
        this.isXMDContactAnonymous = str == null || str == "";
    }

    public XMDUtils() {
        IBackOffRetrierFormulaCallback iBackOffRetrierFormulaCallback = new IBackOffRetrierFormulaCallback() { // from class: com.qualtrics.digital.XMDUtils$$ExternalSyntheticLambda0
            @Override // com.qualtrics.digital.IBackOffRetrierFormulaCallback
            public final int getBackOffDelayInMilliseconds(int i) {
                return XMDUtils.lambda$new$0(i);
            }
        };
        this.retryBackOffFormula = iBackOffRetrierFormulaCallback;
        this.isXMDContactAnonymous = false;
        this.targetingRetrier = new BackOffRetrier(targetingRetrierName, 4, iBackOffRetrierFormulaCallback);
        this.contactFrequencyRetrier = new BackOffRetrier(contactFrequencyRetrierName, this.contactFrequencyRetryLimit, this.retryBackOffFormula);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(int i) {
        return ((int) (Math.pow(2.0d, i - 1) * 2.0d)) * 1000;
    }

    public static XMDUtils getInstance() {
        if (instance == null) {
            instance = new XMDUtils();
        }
        return instance;
    }
}
