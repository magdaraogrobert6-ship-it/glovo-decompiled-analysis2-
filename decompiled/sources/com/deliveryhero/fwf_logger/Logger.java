package com.deliveryhero.fwf_logger;

/* JADX INFO: loaded from: classes2.dex */
public final class Logger implements ILogger {
    private final FwFLogLevel level;
    private final IFwFLogging logger;

    private final void log(FwFLogLevel fwFLogLevel, String str, String str2) {
        if (fwFLogLevel.compareTo(this.level) >= 0 && str2 != null) {
            this.logger.logFwF(fwFLogLevel, "FwF_SDK." + str, str2);
        }
    }

    public Logger(FwFLogLevel fwFLogLevel, IFwFLogging iFwFLogging) {
        fwFLogLevel.getClass();
        iFwFLogging.getClass();
        this.level = fwFLogLevel;
        this.logger = iFwFLogging;
    }

    @Override // com.deliveryhero.fwf_logger.ILogger
    public void logD(String str, String str2) {
        str.getClass();
        log(FwFLogLevel.DEBUG, str, str2);
    }

    @Override // com.deliveryhero.fwf_logger.ILogger
    public void logE(String str, String str2) {
        str.getClass();
        log(FwFLogLevel.ERROR, str, str2);
    }

    @Override // com.deliveryhero.fwf_logger.ILogger
    public void logI(String str, String str2) {
        str.getClass();
        log(FwFLogLevel.INFO, str, str2);
    }

    @Override // com.deliveryhero.fwf_logger.ILogger
    public void logV(String str, String str2) {
        str.getClass();
        log(FwFLogLevel.VERBOSE, str, str2);
    }

    @Override // com.deliveryhero.fwf_logger.ILogger
    public void logW(String str, String str2) {
        str.getClass();
        log(FwFLogLevel.WARNING, str, str2);
    }
}
