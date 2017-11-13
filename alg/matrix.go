func add (a *matrix) (b *matrix) (c *matrix) {
  for i, m3x := 0, 0; i < len(a.ele); i += a.stride {
    for m2r0 := 0; m2r0 < b.stride; m2r0++ {
      c.ele[m3x] = a.ele[m3x] + b.ele[m3x]
      m1x++
    }
  }
  return c
}

func multiply(a *matrix) (b *matrix) (c *matrix) {
  for i, m3x := 0, 0; i < len(a.ele); i += a.stride {
    for m2r0 := 0; m2r0 < b.stride; m2r0++ {
      for m1x, m2x := m1c0, m2r0; m2x < len(b.ele); m2x += b.stride {
          c.ele[m3x] += a.ele[m1x] * b.ele[m2x]
          m1x++
      }
      m3x++
    }
  }
  return c
}

func custom(a *matrix) (b *matrix) (c *matrix) {
  for i, m3x := 0, 0; i < len(a.ele); i += a.stride {
    for m2r0 := 0; m2r0 < b.stride; m2r0++ {
      c.ele[m3x] = (max(a.ele[m3x],b.ele[m3x]) +
                   pow(a.ele[m3x], 2) +
                   pow(b.ele[m3x],2))
      m1x++
    }
  }
  return c
}
