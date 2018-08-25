package srbrettle.financialformulas;

import junit.framework.Assert;
import org.junit.Test;

public class FinancialFormulasTest {

    @Test
    public void AssetTurnover_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcAssetTurnover(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void AverageCollectionPeriod_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcAverageCollectionPeriod(500,200);
        Assert.assertEquals(912.5,result);
    }

    @Test
    public void CashConversionCycle_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcCashConversionCycle(500,200,100);
        Assert.assertEquals(600.0,result);
    }

    @Test
    public void InventoryConversionPeriod_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcInventoryConversionPeriod(365);
        Assert.assertEquals(1.0,result);
    }

    @Test
    public void InventoryConversionRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcInventoryConversionRatio(500,200);
        Assert.assertEquals(1.25,result);
    }

    @Test
    public void InventoryTurnover_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcInventoryTurnover(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void PayablesConversionPeriod_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcPayablesConversionPeriod(500,200);
        Assert.assertEquals(912.5,result);
    }

    @Test
    public void ReceivablesConversionPeriod_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReceivablesConversionPeriod(500,200);
        Assert.assertEquals(912.5,result);
    }

    @Test
    public void ReceivablesTurnoverRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReceivablesTurnoverRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void Assets_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcAssets(300,200);
        Assert.assertEquals(500.0,result);
    }

    @Test
    public void Ebit_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcEbit(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void Equity_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcEquity(300,200);
        Assert.assertEquals(100.0,result);
    }

    @Test
    public void GrossProfit_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcGrossProfit(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void Liabilities_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcLiabilities(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void NetProfit_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcNetProfit(500,200,100,100);
        Assert.assertEquals(100.0,result);
    }

    @Test
    public void OperatingProfit_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcOperatingProfit(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void SalesRevenue_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcSalesRevenue(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void DebtEquityRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDebtEquityRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DebtRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDebtRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DebtServiceCoverageRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDebtServiceCoverageRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void LongTermDebtEquityRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcLongTermDebtEquityRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void BookValue_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcBookValue(500,200);
        Assert.assertEquals(300.0,result);
    }

    @Test
    public void DecliningBalance_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDecliningBalance(0.5,200);
        Assert.assertEquals(100.0,result);
    }

    @Test
    public void UnitsOfProduction_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcUnitsOfProduction(500,200,100,150);
        Assert.assertEquals(450.0,result);
    }

    @Test
    public void StraightLineMethod_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcStraightLineMethod(500,200, 10);
        Assert.assertEquals(30.0,result);
    }

    @Test
    public void CashRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcCashRatio(500,200, 100);
        Assert.assertEquals(7.0,result);
    }

    @Test
    public void CurrentRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcCurrentRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void OperatingCashFlowRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcOperatingCashFlowRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void QuickRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcQuickRatio(500,200,100);
        Assert.assertEquals(3.0,result);
    }

    @Test
    public void DividendCover_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDividendCover(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DividendsPerShare_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDividendsPerShare(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void DividendYield_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcDividendYield(5,200);
        Assert.assertEquals(0.025,result);
    }

    @Test
    public void EarningsPerShare_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcEarningsPerShare(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void PayoutRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcPayoutRatio(500,10000);
        Assert.assertEquals(0.05,result);
    }

    @Test
    public void PegRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcPegRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void PriceSalesRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcPriceSalesRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void EfficiencyRatio_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcEfficiencyRatio(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void GrossProfitMargin_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcGrossProfitMargin(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void OperatingMargin_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcOperatingMargin(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ProfitMargin_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcProfitMargin(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ReturnOnAssets_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReturnOnAssets(500,200);
        Assert.assertEquals(2.50,result);
    }

    @Test
    public void ReturnOnCapital_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReturnOnCapital(500,0.2, 100);
        Assert.assertEquals(4.0,result);
    }

    @Test
    public void ReturnOnEquity_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReturnOnEquity(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ReturnOnNetAssets_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReturnOnNetAssets(500,200,50);
        Assert.assertEquals(2.0,result);
    }

    @Test
    public void RiskAdjustedReturnOnCapital_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcRiskAdjustedReturnOnCapital(500,200);
        Assert.assertEquals(2.5,result);
    }

    @Test
    public void ReturnOnInvestment_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcReturnOnInvestment(500,200);
        Assert.assertEquals(1.5,result);
    }

    @Test
    public void Ebitda_ValidInput_ReturnsCorrect() {
        double result = FinancialFormulas.CalcEbitda(500,200,100);
        Assert.assertEquals(800.0,result);
    }

}
