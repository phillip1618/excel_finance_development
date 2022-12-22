Function colaMpv2(ByVal beginning_year As Integer, ByVal end_year As Integer, ByVal annual_payment As Double, ByVal discount_rate As Double, ByVal inflation_rate As Double, ByVal frequency As Integer, ByVal cola_bool As Boolean, ByVal pay_beginning_of_year As Boolean) As Double

Dim years As Integer
years = end_year - beginning_year

Dim periods As Integer
periods = years * frequency

Dim period_payment As Double
period_payment = annual_payment / frequency

Dim period_discount_rate As Double
Dim period_inflation_rate As Double
period_discount_rate = discount_rate / frequency
period_inflation_rate = inflation_rate / frequency

Dim payments() As Double
ReDim payments(periods)

If cola_bool = True Then
For I = 0 To (periods)
    payments(I) = period_payment * ((1 + period_inflation_rate) ^ I)
Next I
Else
For I = 0 To (periods)
    payments(I) = period_payment
Next I
End If

npv_value = NPV(period_discount_rate, payments)
colaMpv2 = npv_value

End Function
