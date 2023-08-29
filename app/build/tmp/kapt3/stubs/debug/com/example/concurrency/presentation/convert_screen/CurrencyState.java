package com.example.concurrency.presentation.convert_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0010H\u00c6\u0003Jq\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 \u00a8\u00062"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/CurrencyState;", "", "currencies", "Lcom/example/concurrency/data/remote/model/Currencies;", "currenciesRates", "Lcom/example/concurrency/data/remote/model/FavoriteResponse;", "amount", "", "base", "Lcom/example/concurrency/presentation/convert_screen/Base;", "target", "Lcom/example/concurrency/presentation/convert_screen/Target;", "target2", "resultAmount", "resultAmount2", "isLoading", "", "error", "(Lcom/example/concurrency/data/remote/model/Currencies;Lcom/example/concurrency/data/remote/model/FavoriteResponse;Ljava/lang/String;Lcom/example/concurrency/presentation/convert_screen/Base;Lcom/example/concurrency/presentation/convert_screen/Target;Lcom/example/concurrency/presentation/convert_screen/Target;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBase", "()Lcom/example/concurrency/presentation/convert_screen/Base;", "getCurrencies", "()Lcom/example/concurrency/data/remote/model/Currencies;", "getCurrenciesRates", "()Lcom/example/concurrency/data/remote/model/FavoriteResponse;", "getError", "()Z", "getResultAmount", "getResultAmount2", "getTarget", "()Lcom/example/concurrency/presentation/convert_screen/Target;", "getTarget2", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class CurrencyState {
    @org.jetbrains.annotations.Nullable
    private final com.example.concurrency.data.remote.model.Currencies currencies = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.concurrency.data.remote.model.FavoriteResponse currenciesRates = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String amount = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.presentation.convert_screen.Base base = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.presentation.convert_screen.Target target = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.concurrency.presentation.convert_screen.Target target2 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String resultAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String resultAmount2 = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String error = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.CurrencyState copy(@org.jetbrains.annotations.Nullable
    com.example.concurrency.data.remote.model.Currencies currencies, @org.jetbrains.annotations.Nullable
    com.example.concurrency.data.remote.model.FavoriteResponse currenciesRates, @org.jetbrains.annotations.NotNull
    java.lang.String amount, @org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.Base base, @org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.Target target, @org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.Target target2, @org.jetbrains.annotations.NotNull
    java.lang.String resultAmount, @org.jetbrains.annotations.NotNull
    java.lang.String resultAmount2, boolean isLoading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CurrencyState() {
        super();
    }
    
    public CurrencyState(@org.jetbrains.annotations.Nullable
    com.example.concurrency.data.remote.model.Currencies currencies, @org.jetbrains.annotations.Nullable
    com.example.concurrency.data.remote.model.FavoriteResponse currenciesRates, @org.jetbrains.annotations.NotNull
    java.lang.String amount, @org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.Base base, @org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.Target target, @org.jetbrains.annotations.NotNull
    com.example.concurrency.presentation.convert_screen.Target target2, @org.jetbrains.annotations.NotNull
    java.lang.String resultAmount, @org.jetbrains.annotations.NotNull
    java.lang.String resultAmount2, boolean isLoading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.concurrency.data.remote.model.Currencies component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.concurrency.data.remote.model.Currencies getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.concurrency.data.remote.model.FavoriteResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.concurrency.data.remote.model.FavoriteResponse getCurrenciesRates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.Base component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.Base getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.Target component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.Target getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.Target component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.concurrency.presentation.convert_screen.Target getTarget2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResultAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResultAmount2() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getError() {
        return null;
    }
}