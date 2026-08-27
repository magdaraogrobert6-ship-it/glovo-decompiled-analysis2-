package io.grpc.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JndiResourceResolverFactory {
    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
        } catch (ClassNotFoundException | Error | RuntimeException unused) {
        }
    }
}
