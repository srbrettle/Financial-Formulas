package srbrettle.financialformulas;

public class FinancialFormulas {

    // Activity
    public double CalcAssetTurnover(double netSales, double totalAssets) {
        double assetTurnover = netSales / totalAssets;
        return assetTurnover;
    }

    public double CalcAverageCollectionPeriod(double accountsReceivable, double annualCreditSales) {
        double averageCollectionPeriod = accountsReceivable / (annualCreditSales / 365);
        return averageCollectionPeriod;
    }

    public double CalcCashConversionCycle(double inventoryConversionPeriod, double receivablesConversionPeriod, double payablesConversionPeriod) {
        double CashConversionCycle = (inventoryConversionPeriod
                + receivablesConversionPeriod - payablesConversionPeriod);
        return CashConversionCycle;
    }

    public double CalcInventoryConversionPeriod(double inventoryTurnoverRatio) {
        double inventoryConversionPeriod = 365 / inventoryTurnoverRatio;
        return inventoryConversionPeriod;
    }

    public double CalcInventoryConversionRatio(double sales, double costOfGoodsSold) {
        double inventoryConversionRatio = (sales * 0.5) / costOfGoodsSold;
        return inventoryConversionRatio;
    }

    public double CalcInventoryTurnover(double sales, double averageInventory) {
        double inventoryTurnover = sales / averageInventory;
        return inventoryTurnover;
    }

    public double CalcPayablesConversionPeriod(double accountsPayable, double purchases) {
        double payablesConversionPeriod = (accountsPayable / purchases) * 365;
        return payablesConversionPeriod;
    }

    public double CalcReceivablesConversionPeriod(double receivables, double netSales) {
        double receivablesConversionPeriod = (receivables / netSales) * 365;
        return receivablesConversionPeriod;
    }

    public double CalcReceivablesTurnoverRatio(double netCreditSales, double averageNetReceivables) {
        double receivablesTurnoverRatio = netCreditSales / averageNetReceivables;
        return receivablesTurnoverRatio;
    }

    // Basic
    public double CalcAssets(double liabilities, double equity) {
        double assets = liabilities + equity;
        return assets;
    }

    public double CalcEbit(double revenue, double operatingExpenses) {
        double ebit = revenue - operatingExpenses;
        return ebit;
    }

    public double CalcEquity(double assets, double liabilities) {
        double equity = assets - liabilities;
        return equity;
    }

    public double CalcGrossProfit(double revenue, double costOfGoodsSold) {
        double grossProfit = revenue - costOfGoodsSold;
        return grossProfit;
    }

    public double CalcLiabilities(double assets, double equity) {
        double liabilities = assets - equity;
        return liabilities;
    }

    public double CalcNetProfit(double grossProfit, double operatingExpenses, double taxes, double interest) {
        double netProfit = grossProfit - operatingExpenses - taxes - interest;
        return netProfit;
    }

    public double CalcOperatingProfit(double grossProfit, double operatingExpenses) {
        double operatingProfit = grossProfit - operatingExpenses;
        return operatingProfit;
    }

    public double CalcSalesRevenue(double grossSales, double salesOfReturnsAndAllowances) {
        double salesRevenue = grossSales - salesOfReturnsAndAllowances;
        return salesRevenue;
    }

    // Debt
    public double CalcDebtEquityRatio(double totalLiabilities, double shareholderEquity) {
        double debtToEquityRatio = totalLiabilities / shareholderEquity;
        return debtToEquityRatio;
    }

    public double CalcDebtRatio(double totalLiabilities, double totalAssets) {
        double debtRatio = totalLiabilities / totalAssets;
        return debtRatio;
    }

    public double CalcDebtServiceCoverageRatio(double netOperatingIncome, double totalDebtService) {
        double debtServiceCoverageRatio = netOperatingIncome / totalDebtService;
        return debtServiceCoverageRatio;
    }

    public double CalcLongTermDebtEquityRatio(double longTermLiabilities, double equity) {
        double longTermDebtToEquityRatio = longTermLiabilities / equity;
        return longTermDebtToEquityRatio;
    }

    // Depreciation
    public double CalcBookValue(double acquisitionCost, double depreciation) {
        double bookValue = acquisitionCost - depreciation;
        return bookValue;
    }

    public double CalcDecliningBalance(double depreciationRate, double bookValueAtBeginningOfYear) {
        double decliningBalance = depreciationRate * bookValueAtBeginningOfYear;
        return decliningBalance;
    }

    public double CalcUnitsOfProduction(double costOfAsset, double residualValue, double estimatedTotalProduction, double actualProduction) {
        double unitsOfProduction = ((costOfAsset - residualValue) / estimatedTotalProduction) * actualProduction;
        return unitsOfProduction;
    }

    public double CalcStraightLineMethod(double costOfFixedAsset, double residualValue, double usefulLifeOfAsset) {
        double straightLineMethod = (costOfFixedAsset - residualValue) / usefulLifeOfAsset;
        return straightLineMethod;
    }

    // Liquidity
    public double CalcCashRatio(double cash, double marketableSecurities, double currentLiabilities) {
        double cashRatio = (cash + marketableSecurities) / currentLiabilities;
        return cashRatio;
    }

    public double CalcCurrentRatio(double currentAssets, double currentLiabilities) {
        double currentRatio = currentAssets / currentLiabilities;
        return currentRatio;
    }

    public double CalcOperatingCashFlowRatio(double operatingCashFlow, double totalDebts) {
        double operatingCashFlowRatio = operatingCashFlow / totalDebts;
        return operatingCashFlowRatio;
    }

    public double CalcQuickRatio(double currentAssets, double inventories, double currentLiabilities) {
        double quickRatio = (currentAssets - inventories) / currentLiabilities;
        return quickRatio;
    }

    // Market
    public double CalcDividendCover(double earningsPerShare, double dividendsPerShare) {
        double dividendCover = earningsPerShare / dividendsPerShare;
        return dividendCover;
    }

    public double CalcDividendsPerShare(double dividendsPaid, double numberOfShares) {
        double dividendPerShare = dividendsPaid / numberOfShares;
        return dividendPerShare;
    }

    public double CalcDividendYield(double annualDividendPerShare, double pricePerShare) {
        double dividendYield = annualDividendPerShare / pricePerShare;
        return dividendYield;
    }

    public double CalcEarningsPerShare(double netEarnings, double numberOfShares) {
        double earningsPerShare = netEarnings / numberOfShares;
        return earningsPerShare;
    }

    public double CalcPayoutRatio(double dividends, double earnings) {
        double payoutRatio = dividends / earnings;
        return payoutRatio;
    }

    public double CalcPegRatio(double pricePerEarnings, double annualEpsGrowth) {
        double pegRatio = pricePerEarnings / annualEpsGrowth;
        return pegRatio;
    }

    public double CalcPriceSalesRatio(double pricePerShare, double revenuePerShare) {
        double priceToSalesRatio = pricePerShare / revenuePerShare;
        return priceToSalesRatio;
    }

    // Profitability
    public double CalcEfficiencyRatio(double nonInterestExpense, double revenue) {
        double efficiencyRatio = nonInterestExpense / revenue;
        return efficiencyRatio;
    }

    public double CalcGrossProfitMargin(double grossProfit, double revenue) {
        double grossProfitMargin = grossProfit / revenue;
        return grossProfitMargin;
    }

    public double CalcOperatingMargin(double operatingIncome, double revenue) {
        double operatingMargin = operatingIncome / revenue;
        return operatingMargin;
    }

    public double CalcProfitMargin(double netProfit, double revenue) {
        double profitMargin = netProfit / revenue;
        return profitMargin;
    }

    public double CalcReturnOnAssets(double netIncome, double totalAssets) {
        double returnOnAssets = netIncome / totalAssets;
        return returnOnAssets;
    }

    public double CalcReturnOnCapital(double ebit, double taxRate, double investedCapital) {
        double returnOnCapital = ebit * (1 - taxRate) / investedCapital;
        return returnOnCapital;
    }

    public double CalcReturnOnEquity(double netIncome, double averageShareholderEquity) {
        double returnOnEquity = netIncome / averageShareholderEquity;
        return returnOnEquity;
    }

    public double CalcReturnOnNetAssets(double netIncome, double fixedAssets, double workingCapital) {
        double returnOnNetAssets = netIncome / (fixedAssets + workingCapital);
        return returnOnNetAssets;
    }

    public double CalcRiskAdjustedReturnOnCapital(double expectedReturn, double economicCapital) {
        double riskAdjustedReturnOnCapital = expectedReturn / economicCapital;
        return riskAdjustedReturnOnCapital;
    }

    public double CalcReturnOnInvestment(double gain, double cost) {
        double returnOnInvestment = (gain - cost) / cost;
        return returnOnInvestment;
    }

    public double CalcEbitda(double ebit, double depreciation, double amortization) {
        double ebitda = ebit + depreciation + amortization;
        return ebitda;
    }
}